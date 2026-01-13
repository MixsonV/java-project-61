package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    private static final String RULE = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void start() {
        Engine.startGame(RULE, createQuestionsAndAnswers());
    }

    public static String[][] createQuestionsAndAnswers() {
        String[][] questionsAndAnswers = new String[Engine.DEFAULT_ROUNDS][2];
        for (var i = 0; i < Engine.DEFAULT_ROUNDS; i++) {
            int number =  Engine.getRandomNumberLockedRange();
            questionsAndAnswers[i] = new String[]{String.valueOf(number), isEven(number) ? "yes" : "no"};
        }
        return questionsAndAnswers;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
