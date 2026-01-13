package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    private static final String RULE = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void start() {
        Engine.startGame(RULE, createQuestionsAndAnswers());
    }

    public static String[][] createQuestionsAndAnswers() {
        String[][] questionsAndAnswers = new String[Engine.DEFAULT_ROUNDS][2];
        for (int i = 0; i < Engine.DEFAULT_ROUNDS; i++) {
            int number = Engine.getRandomNumberLockedRange();
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
