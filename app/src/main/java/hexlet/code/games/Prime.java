package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    private static final String RULE = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void start() {
        Engine engine = new Engine();
        engine.printMessage(RULE);

        Object[][] objects = new Object[engine.getRounds()][2];
        for (int i = 0; i < engine.getRounds(); i++) {
            int number = engine.getRandomNumberLockedRange();
            objects[i] = new Object[]{number, isPrimeNumber(number) ? "yes" : "no"};
        }

        engine.startQuiz(objects);
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
