package hexlet.code.games;

import hexlet.code.Engine;

public class Calculator {
    public static final String RULE = "What is the result of the expression?";

    public static void start(Engine engine) {
        engine.printRule(RULE);

        for (int i = 0; i < engine.getRounds(); i++) {
            String symbols = "+-*";
            char symbol = symbols.charAt(engine.getRandomNumber(symbols.length()));

            int number1 = engine.getRandomNumberLockedRange();
            int number2 = engine.getRandomNumberLockedRange();
            engine.printQuestion(number1 + " " + symbol + " " + number2);
            int answer = engine.getScanner().nextInt();
            engine.printAnswer(answer);

            switch (symbol) {
                case '+':
                    engine.checkAnswer(answer, number1 + number2);
                    break;
                case '-':
                    engine.checkAnswer(answer, number1 - number2);
                    break;
                case '*':
                    engine.checkAnswer(answer, number1 * number2);
                    break;
                default:
                    engine.endGame();
                    break;
            }
        }

        engine.winGame();
    }
}
