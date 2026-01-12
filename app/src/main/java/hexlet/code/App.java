package hexlet.code;

import hexlet.code.games.Calculator;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;

class App {

    private static final String MENU_EXIT = "0";
    private static final String MENU_GREET = "1";
    private static final String MENU_EVEN = "2";
    private static final String MENU_CALCULATOR = "3";
    private static final String MENU_GCD = "4";
    private static final String MENU_PROGRESSION = "5";
    private static final String MENU_PRIME = "6";

    public static void main(String[] args) {
        meetingMessage();
        printMenu();

        Scanner scanner = new Scanner(System.in);
        String choice = scanner.next();
        switch (choice.toLowerCase()) {
            case MENU_EXIT:
                System.exit(0);
                break;
            case MENU_GREET:
                Cli.printGreets();
                break;
            case MENU_EVEN:
                Even.start();
                break;
            case MENU_GCD:
                GCD.start();
                break;
            case MENU_CALCULATOR:
                Calculator.start();
                break;
            case MENU_PROGRESSION:
                Progression.start();
                break;
            case MENU_PRIME:
                Prime.start();
                break;
            default:
                System.out.println("'" + choice + "' is not a valid menu item! Application will Exit!");
                System.exit(0);
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

    public static void meetingMessage() {
        System.out.println("Welcome to the Brain Games!");
        Cli.greetsThePlayer();
    }
}
