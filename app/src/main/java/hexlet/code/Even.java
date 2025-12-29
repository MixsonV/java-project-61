package hexlet.code;

import java.util.Scanner;
import java.util.Random;

public class Even {
    static final int COUNT_GAME = 3;
    static final int MIN_RANGE = 1;
    static final int MAX_RANGE = 101;

    public static void evenNumber(Scanner sc) {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        String userName = Cli.getUserName();
        Random randomGenerator = new Random();

        for (var i = 0; i < COUNT_GAME; i++) {
            int number = randomGenerator.nextInt(MIN_RANGE, MAX_RANGE);
            System.out.println("Question: " + number + " is even?");
            String answer = sc.next();
            System.out.println("Your answer: " + answer);
            if (number % 2 == 0 && answer.equals("yes") || number % 2 != 0 && answer.equals("no")) {
                System.out.println("Correct!");
            } else {
                String correctAnswer = answer.equals("yes") ? "no" : "yes";
                System.out.println(answer + " is wrong answer ;(. Correct answer was " + correctAnswer);
                System.out.println("Let's try again, " + userName + "!");
                System.exit(0);
                return;
            }
        }

        System.out.println("Congratulations, " + userName + "!");
    }
}
