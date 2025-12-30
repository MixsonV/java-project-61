package hexlet.code;

import hexlet.code.games.Calculator;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

class App {
    public static final Engine ENGINE = new Engine();

    private static final int MENU_EXIT = 0;
    private static final int MENU_GREET = 1;
    private static final int MENU_EVEN = 2;
    private static final int MENU_CALCULATOR = 3;
    private static final int MENU_GCD = 4;
    private static final int MENU_PROGRESSION = 5;
    private static final int MENU_PRIME = 6;

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
            case MENU_GCD:
                GCD.start(ENGINE);
                break;
            case MENU_CALCULATOR:
                Calculator.start(ENGINE);
                break;
            case MENU_PROGRESSION:
                Progression.start(ENGINE);
                break;
            case MENU_PRIME:
                Prime.start(ENGINE);
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
        System.out.println(MENU_GCD + " - GCD");
        System.out.println(MENU_PROGRESSION + " - Progression");
        System.out.println(MENU_PRIME + " - Prime");
        System.out.println(MENU_EXIT + " - Exit");
        System.out.print("Your Choice: ");
    }

}
