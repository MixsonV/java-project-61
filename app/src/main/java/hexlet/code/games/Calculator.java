package hexlet.code.games;

import hexlet.code.Engine;

public class Calculator {
    public static final String RULE = "What is the result of the expression?";

    public static void start() {
        Engine engine = new Engine();
        engine.printMessage(RULE);

        String symbols = "+-*";
        Object[][] objects = new Object[engine.getRounds()][2];
        for (int i = 0; i < engine.getRounds(); i++) {
            char symbol = symbols.charAt(engine.getRandomNumber(symbols.length()));
            int number1 = engine.getRandomNumberLockedRange();
            int number2 = engine.getRandomNumberLockedRange();
            String template = number1 + " " + symbol + " " + number2;
            switch (symbol) {
                case '+':
                    objects[i] = new Object[]{template, number1 + number2};
                    break;
                case '-':
                    objects[i] = new Object[]{template, number1 - number2};
                    break;
                case '*':
                    objects[i] = new Object[]{template, number1 * number2};
                    break;
                default:
                    engine.printError(symbol);
                    engine.endGame();
            }
        }
        engine.startQuiz(objects);
    }
}
