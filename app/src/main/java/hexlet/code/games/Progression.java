package hexlet.code.games;

import hexlet.code.Engine;

import java.util.ArrayList;

public class Progression {
    private static final String RULE = "What number is missing in the progression?";
    private static final int MIN_LENGTH = 5;
    private static final int MAX_LENGTH = 11;
    private static final String HIDING_SYMBOL = "..";
    private static Engine engine;

    public static void start() {
        engine = new Engine();
        engine.printMessage(RULE);

        Object[][] objects = new Object[engine.getRounds()][2];
        for (int i = 0; i < engine.getRounds(); i++) {
            objects[i] = createProgression();
        }

        engine.startQuiz(objects);
    }

    public static Object[] createProgression() {
        int length = engine.getRandomNumber(MIN_LENGTH, MAX_LENGTH);
        int hiddenPosition = engine.getRandomNumber(length);
        int hiddenNumber = 0;
        int startNumber = engine.getRandomNumberLockedRange();
        int step = engine.getRandomNumberLockedRange();
        ArrayList<String> nums = new ArrayList<>();
        for (var j = 0; j < length; j++) {
            int number = findCurrentElement(startNumber, step, j);
            if (j == hiddenPosition) {
                hiddenNumber = number;
                nums.add(HIDING_SYMBOL);
            } else {
                nums.add("" + number);
            }
        }
        return new Object[]{String.join(", ", nums), hiddenNumber};
    }

    public static int findCurrentElement(int start, int step, int index) {
        return start + step * index;
    }
}
