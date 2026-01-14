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
        String userName = welcomeMessage();
        printMenu();

        Scanner scanner = new Scanner(System.in);
        String choice = scanner.next();
        switch (choice.toLowerCase()) {
            case MENU_EXIT:
                System.exit(0);
                break;
            case MENU_GREET:
                printHello(userName);
                break;
            case MENU_EVEN:
                Even.start(userName);
                break;
            case MENU_GCD:
                GCD.start(userName);
                break;
            case MENU_CALCULATOR:
                Calculator.start(userName);
                break;
            case MENU_PROGRESSION:
                Progression.start(userName);
                break;
            case MENU_PRIME:
                Prime.start(userName);
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

    public static String welcomeMessage() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.next();
        printHello(userName);
        return userName;
    }

    public static void printHello(String userName) {
        System.out.println("Hello, " + userName + "!");
    }
}
