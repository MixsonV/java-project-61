package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {
    private static final String RULE = "Find the greatest common divisor of given numbers.";

    public static void start(Engine engine) {
        engine.printRule(RULE);

        for (int i = 0; i < engine.getRounds(); i++) {
            int firstNumber = engine.getRandomNumberLockedRange();
            int secondNumber = engine.getRandomNumberLockedRange();
            engine.printQuestion(firstNumber + " " + secondNumber);

            int answer = engine.getScanner().nextInt();
            engine.printAnswer(answer);

            int gcd = findGCD(firstNumber, secondNumber);
            engine.checkAnswer(answer, gcd);
        }

        engine.winGame();
    }

    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return findGCD(b, a % b);
        }
    }
}
