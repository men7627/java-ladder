package ladder.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Line {
    private static final String HEADER_HORIZON_LINE = "   ";
    private static final String VERTICAL_LINE = "|";
    private static final String NEW_LINE = "\n";
    private static final String NO_HORIZON_LINE = "     ";
    private static final String HORIZON_LINE = "-----";

    private List<Boolean> horizon;

    public Line(int playerNumber) {
        horizon = new ArrayList<>();
        makeRandomBooleans(playerNumber);
    }

    public List<Boolean> getHorizon() {
        return this.horizon;
    }

    private void makeRandomBooleans(int playerNumber){
        for (int i = 0; i < playerNumber - 1; i++) {
            horizon.add(makeProperBoolean(i));
        }
    }

    private Boolean makeProperBoolean(int currentIndex) {
        Random random = new Random();
        if (currentIndex == 0) {
            return random.nextBoolean();
        }
        if (!this.horizon.get(currentIndex - 1)) {
            return random.nextBoolean();
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(HEADER_HORIZON_LINE);
        for (Boolean bool : this.horizon) {
            sb.append(VERTICAL_LINE);
            sb.append(toStringEachHorLine(bool));
        }
        sb.append(VERTICAL_LINE+NEW_LINE);
        return sb.toString();
    }

    private String toStringEachHorLine(Boolean bool) {
        String result = NO_HORIZON_LINE;
        if (bool) {
            result = HORIZON_LINE;
        }
        return result;
    }
}
