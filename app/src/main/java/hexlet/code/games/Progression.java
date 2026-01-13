package hexlet.code.games;

import hexlet.code.Engine;

import java.util.ArrayList;
import java.util.List;

public class Progression {
    private static final String RULE = "What number is missing in the progression?";
    private static final int MIN_LENGTH = 5;
    private static final int MAX_LENGTH = 11;
    private static final String HIDING_SYMBOL = "..";

    public static void start() {
        Engine.startGame(RULE, createQuestionsAndAnswers());
    }

    public static String[][] createQuestionsAndAnswers() {
        String[][] questionsAndAnswers = new String[Engine.DEFAULT_ROUNDS][2];
        for (int i = 0; i < Engine.DEFAULT_ROUNDS; i++) {
            int startNumber = Engine.getRandomNumberLockedRange();
            int step = Engine.getRandomNumberLockedRange();
            int length = Engine.getRandomNumber(MIN_LENGTH, MAX_LENGTH);

            questionsAndAnswers[i] = hideElement(createProgression(startNumber, step, length));
        }
        return questionsAndAnswers;
    }

    public static List<String> createProgression(int startNumber, int step, int length) {
        List<String> result = new ArrayList<>();
        for (var j = 0; j < length; j++) {
            int number = findCurrentElement(startNumber, step, j);
            result.add(String.valueOf(number));
        }
        return result;
    }

    public static int findCurrentElement(int start, int step, int index) {
        return start + step * index;
    }

    public static String[] hideElement(List<String> progression) {
        int hiddenPosition = Engine.getRandomNumber(progression.size());
        String hiddenNumber = progression.get(hiddenPosition);
        progression.set(hiddenPosition, HIDING_SYMBOL);
        return new String[]{String.join(", ", progression), hiddenNumber};
    }
}
