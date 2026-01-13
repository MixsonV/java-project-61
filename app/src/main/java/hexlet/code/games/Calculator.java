package hexlet.code.games;

import hexlet.code.Engine;

public class Calculator {
    public static final String RULE = "What is the result of the expression?";
    public static final String SYMBOLS = "+-*";

    public static void start() {
        Engine.startGame(RULE, createQuestionsAndAnswers());
    }

    public static String[][] createQuestionsAndAnswers() {
        String[][] questionsAndAnswers = new String[Engine.DEFAULT_ROUNDS][2];
        for (int i = 0; i < Engine.DEFAULT_ROUNDS; i++) {
            char symbol = SYMBOLS.charAt(Engine.getRandomNumber(SYMBOLS.length()));
            int number1 = Engine.getRandomNumberLockedRange();
            int number2 = Engine.getRandomNumberLockedRange();
            questionsAndAnswers[i] = calculate(number1, number2, symbol);
        }
        return questionsAndAnswers;
    }

    public static String[] calculate(int number1, int number2, char symbol) {
        switch (symbol) {
            case '+':
                return new String[]{number1 + " + " + number2, String.valueOf(number1 + number2)};
            case '-':
                return new String[]{number1 + " - " + number2, String.valueOf(number1 - number2)};
            case '*':
                return new String[]{number1 + " * " + number2, String.valueOf(number1 * number2)};
            default:
                Engine.printError(String.valueOf(symbol));
        }
        return null;
    }
}
