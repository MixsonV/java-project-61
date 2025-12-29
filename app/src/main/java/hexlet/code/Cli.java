package hexlet.code;

import java.util.Scanner;

class Cli {
    private static String userName = "Unknown player";

    public static void greetsThePlayer(Scanner sc) {
        System.out.println("May I have your name?");
        userName = sc.next();
        printGreets();
    }

    public static String getUserName() {
        return userName;
    }

    public static void printGreets() {
        System.out.println("Hello, " + userName + "!");
    }
}
