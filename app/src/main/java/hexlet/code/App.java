package hexlet.code;

import hexlet.code.games.Calculator;
import hexlet.code.games.Even;

class App {
    public static final Engine ENGINE = new Engine();

    private static final int MENU_GREET = 1;
    private static final int MENU_EVEN = 2;
    private static final int MENU_CALCULATOR = 3;
    private static final int MENU_EXIT = 0;

    public static void main(String[] args) {
        ENGINE.meetingPlayer();

        printMenu();

        int choice = ENGINE.getScanner().nextInt();
        switch (choice) {
            case MENU_EXIT:
                System.exit(0);
                break;
            case MENU_GREET:
                Cli.printGreets();
                break;
            case MENU_EVEN:
                Even.start(ENGINE);
                break;
            case MENU_CALCULATOR:
                Calculator.start(ENGINE);
                break;
            default:
                break;
        }
    }

    public static void printMenu() {
        System.out.println("Please choose the number and press Enter!");
        System.out.println(MENU_GREET + " - Greet");
        System.out.println(MENU_EVEN + " - Even");
        System.out.println(MENU_CALCULATOR + " - Calculator");
        System.out.println(MENU_EXIT + " - Exit");
        System.out.print("Your Choice: ");
    }

}
