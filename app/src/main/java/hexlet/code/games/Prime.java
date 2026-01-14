package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    private static final String RULE = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void start(String userName) {
        Engine.startGame(RULE, createQuestionsAndAnswers(), userName);
    }

    public static String[][] createQuestionsAndAnswers() {
        String[][] questionsAndAnswers = new String[Engine.DEFAULT_ROUNDS][2];
        for (int i = 0; i < Engine.DEFAULT_ROUNDS; i++) {
            int number = Utils.getRandomNumberLockedRange();
            questionsAndAnswers[i] = new String[]{String.valueOf(number), isPrimeNumber(number) ? "yes" : "no"};
        }
        return questionsAndAnswers;
    }

    public static boolean isPrimeNumber(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
