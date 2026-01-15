package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.ArrayList;
import java.util.List;

public class Progression {
    private static final String RULE = "What number is missing in the progression?";
    private static final int MIN_LENGTH = 5;
    private static final int MAX_LENGTH = 11;
    private static final String HIDING_SYMBOL = "..";
    private static final int MIN_RANGE = 1;
    private static final int MAX_RANGE = 100;

    public static void start() {
        Engine.startGame(RULE, createQuestionsAndAnswers());
    }

    public static String[][] createQuestionsAndAnswers() {
        String[][] questionsAndAnswers = new String[Engine.DEFAULT_ROUNDS][2];
        for (int i = 0; i < Engine.DEFAULT_ROUNDS; i++) {
            int startNumber = Utils.getRandomNumber(MIN_RANGE, MAX_RANGE);
            int step = Utils.getRandomNumber(MIN_RANGE, MAX_RANGE);
            int length = Utils.getRandomNumber(MIN_LENGTH, MAX_LENGTH);

            questionsAndAnswers[i] = hideElement(createProgression(startNumber, step, length));
        }
        return questionsAndAnswers;
    }

    public static List<String> createProgression(int startNumber, int step, int length) {
        List<String> result = new ArrayList<>();
        for (var j = 0; j < length; j++) {
            int number = startNumber + step * j;
            result.add(String.valueOf(number));
        }
        return result;
    }

    public static String[] hideElement(List<String> progression) {
        int hiddenPosition = Utils.getRandomNumber(progression.size());
        String hiddenNumber = progression.get(hiddenPosition);
        progression.set(hiddenPosition, HIDING_SYMBOL);
        return new String[]{String.join(" ", progression), hiddenNumber};
    }
}
