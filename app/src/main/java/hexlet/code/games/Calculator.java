package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calculator {
    public static final String RULE = "What is the result of the expression?";
    public static final String SYMBOLS = "+-*";

    public static void start(String userName) {
        Engine.startGame(RULE, createQuestionsAndAnswers(), userName);
    }

    public static String[][] createQuestionsAndAnswers() {
        String[][] questionsAndAnswers = new String[Engine.DEFAULT_ROUNDS][2];
        for (int i = 0; i < Engine.DEFAULT_ROUNDS; i++) {
            char symbol = SYMBOLS.charAt(Utils.getRandomNumber(SYMBOLS.length()));
            int number1 = Utils.getRandomNumberLockedRange();
            int number2 = Utils.getRandomNumberLockedRange();
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
