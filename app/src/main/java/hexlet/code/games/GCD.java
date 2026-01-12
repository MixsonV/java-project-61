package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {
    private static final String RULE = "Find the greatest common divisor of given numbers.";

    public static void start() {
        Engine engine = new Engine();
        engine.printMessage(RULE);

        Object[][] objects = new Object[engine.getRounds()][2];
        for (int i = 0; i < engine.getRounds(); i++) {
            int firstNumber = engine.getRandomNumberLockedRange();
            int secondNumber = engine.getRandomNumberLockedRange();

            objects[i] = new Object[]{firstNumber + " " + secondNumber, findGCD(firstNumber, secondNumber)};
        }

        engine.startQuiz(objects);
    }

    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return findGCD(b, a % b);
        }
    }
}
