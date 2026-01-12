package hexlet.code;

import java.util.Scanner;

class Cli {
    private static String userName = "Unknown player";

    public static String getUserName() {
        return userName;
    }

    public static void greetsThePlayer() {
        System.out.println("May I have your name?");
        Scanner scanner = new Scanner(System.in);
        userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
    }

    public static void printGreets() {
        System.out.println("Hello, " + userName + "!");
    }
}
