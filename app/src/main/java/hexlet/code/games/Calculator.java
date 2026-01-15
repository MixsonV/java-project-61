package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calculator {
    public static final String RULE = "What is the result of the expression?";
    public static final String SYMBOLS = "+-*";
    private static final int MIN_RANGE = 1;
    private static final int MAX_RANGE = 100;

    public static void start() {
        Engine.startGame(RULE, createQuestionsAndAnswers());
    }

    public static String[][] createQuestionsAndAnswers() {
        String[][] questionsAndAnswers = new String[Engine.DEFAULT_ROUNDS][2];
        for (int i = 0; i < Engine.DEFAULT_ROUNDS; i++) {
            char symbol = SYMBOLS.charAt(Utils.getRandomNumber(SYMBOLS.length()));
            int number1 = Utils.getRandomNumber(MIN_RANGE, MAX_RANGE);
            int number2 = Utils.getRandomNumber(MIN_RANGE, MAX_RANGE);
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
                throw new RuntimeException("Unknown generated symbol: '" + symbol + "'");
        }
    }
}
