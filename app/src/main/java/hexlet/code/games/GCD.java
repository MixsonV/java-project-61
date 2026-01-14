package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    private static final String RULE = "Find the greatest common divisor of given numbers.";

    public static void start(String userName) {
        Engine.startGame(RULE, createQuestionsAndAnswers(), userName);
    }

    public static String[][] createQuestionsAndAnswers() {
        String[][] questionsAndAnswers = new String[Engine.DEFAULT_ROUNDS][2];
        for (int i = 0; i < Engine.DEFAULT_ROUNDS; i++) {
            int number1 = Utils.getRandomNumberLockedRange();
            int number2 = Utils.getRandomNumberLockedRange();

            questionsAndAnswers[i] = new String[]{number1 + " " + number2, String.valueOf(findGCD(number1, number2))};
        }
        return questionsAndAnswers;
    }

    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return findGCD(b, a % b);
        }
    }
}
