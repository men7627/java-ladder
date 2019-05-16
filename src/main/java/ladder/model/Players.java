package ladder.model;

import ladder.model.frame.Input;

import java.util.List;

public class Players extends Input<PlayerName> {
    private static final String DUPLICATE_NAME_ERROR = "중복 이름 오류";

    public Players(String input) {
        super(input);
        addNames(input);
    }

    @Override
    protected void addNames(String input) {
        for(String name : input.split(DELIMITER)){
            checkDuplicateName(name);
            names.add(new PlayerName(name));
        }
    }

    public List<PlayerName> getPlayerNames() {
        return names;
    }

    public int getPlayerNumber() {
        return names.size();
    }

    public int getPlayerIndexByPlayerName(PlayerName name) {
        return this.names.indexOf(name);
    }

    private void checkDuplicateName(String name) {
        if (names.contains(new PlayerName(name))) {
            throw new IllegalArgumentException(DUPLICATE_NAME_ERROR);
        }
    }
}
