package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    private static final String RULE = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static final int MIN_RANGE = 1;
    private static final int MAX_RANGE = 100;

    public static void start() {
        Engine.startGame(RULE, createQuestionsAndAnswers());
    }

    public static String[][] createQuestionsAndAnswers() {
        String[][] questionsAndAnswers = new String[Engine.DEFAULT_ROUNDS][2];
        for (var i = 0; i < Engine.DEFAULT_ROUNDS; i++) {
            int number =  Utils.getRandomNumber(MIN_RANGE, MAX_RANGE);
            questionsAndAnswers[i] = new String[]{String.valueOf(number), isEven(number) ? "yes" : "no"};
        }
        return questionsAndAnswers;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
