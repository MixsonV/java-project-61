package hexlet.code.games;

import hexlet.code.Engine;

import java.util.ArrayList;

public class Progression {
    private static final String RULE = "What number is missing in the progression?";
    private static final int MIN_LENGTH = 5;
    private static final int MAX_LENGTH = 11;

    public static void start(Engine engine) {
        engine.printRule(RULE);

        for (var i = 0; i < engine.getRounds(); i++) {
            int length = engine.getRandomNumber(MIN_LENGTH, MAX_LENGTH);
            int hiddenPosition = engine.getRandomNumber(length);
            String hidingSymbol = "..";
            int currentNumber = engine.getRandomNumberLockedRange();
            int hiddenNumber = currentNumber;
            int step = engine.getRandomNumberLockedRange();
            ArrayList<String> progression = new ArrayList<>();

            for (var j = 0; j < length; j++) {
                int number = currentNumber + step * j;
                if (j == hiddenPosition) {
                    hiddenNumber = number;
                    progression.add(hidingSymbol);
                } else {
                    progression.add("" + number);
                }
            }

            engine.printQuestion(String.join(", ", progression));

            int answer = engine.getScanner().nextInt();
            engine.printAnswer(answer);

            engine.checkAnswer(answer, hiddenNumber);
        }

        engine.winGame();
    }
}
