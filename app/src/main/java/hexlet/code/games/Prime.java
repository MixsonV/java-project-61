package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    private static final String RULE = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void start(Engine engine) {
        engine.printRule(RULE);

        for (int i = 0; i < engine.getRounds(); i++) {
            int number = engine.getRandomNumberLockedRange();
            engine.printQuestion(number);

            String answer = engine.getScanner().next();
            engine.printAnswer(answer);

            if (isPrimeNumber(number)) {
                engine.checkAnswer(answer, "yes");
            } else {
                engine.checkAnswer(answer, "no");
            }
        }

        engine.winGame();
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
