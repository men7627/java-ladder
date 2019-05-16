package ladder.view;

import ladder.model.Floor;

import java.util.Scanner;

public class InputView {
    private static final String INPUT_NAMES_MESSAGE = "참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)";
    private static final String INPUT_FLOORS_MESSAGE = "최대 사다리 높이는 몇 개인가요";
    private static final String INPUT_RESULTS_MESSAGE = "실행결과를 입력하세요. (결과는 쉼표(,)로 구분하세요)";
    private static final String INPUT_SELECT_RESULTS_MESSAGE = "결과를 보고 싶은 사람은? (종료를 원하시면 exit을 입력하세요)";
    private static Scanner scanner = new Scanner(System.in);

    public static String inputPlayers() {
        System.out.println(INPUT_NAMES_MESSAGE);
        return scanner.nextLine();
    }

    public static String inputResults() {
        System.out.println(INPUT_RESULTS_MESSAGE);
        return scanner.nextLine();
    }

    public static Floor inputFloors() {
        System.out.println(INPUT_FLOORS_MESSAGE);
        return new Floor(scanner.nextLine());
    }

    public static String inputSelect() {
        System.out.println(INPUT_SELECT_RESULTS_MESSAGE);
        return scanner.nextLine();
    }
}
