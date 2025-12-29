package hexlet.code;

import java.util.Scanner;

class App {
    public static void main(String[] args) {
        System.out.println("Welcome to the Brain Games!");
        Scanner sc = new Scanner(System.in);
        Cli.greetsThePlayer(sc);

        System.out.println("Please choose the number and press Enter!");
        System.out.print("1 - Greet \n2 - Even \n0 - Exit \nYour Choice: ");
        switch (sc.nextInt()) {
            case 0:
                System.exit(0);
                break;
            case 1:
                Cli.printGreets();
                break;
            case 2:
                Even.evenNumber(sc);
                break;
            default:
                break;
        }
    }
}
