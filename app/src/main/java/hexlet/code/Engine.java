package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public final class Engine {
    private static final int DEFAULT_MIN_RANGE = 1;
    private static final int DEFAULT_MAX_RANGE = 100;
    public static final int DEFAULT_ROUNDS = 3;

    private static String userName = Cli.getUserName();;
    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();

    // get random number in range [DEFAULT_MIN_RANGE, DEFAULT_MAX_RANGE]
    public static int getRandomNumberLockedRange() {
        return getRandomNumber(DEFAULT_MIN_RANGE, DEFAULT_MAX_RANGE) + 1;
    }

    // get random number in range [0, newMaxRange]
    public static int getRandomNumber(int newMaxRange) {
        return random.nextInt(newMaxRange);
    }

    // get random number in range [newMinRange, newMaxRange]
    public static int getRandomNumber(int newMinRange, int newMaxRange) {
        return random.nextInt(newMinRange, newMaxRange);
    }

    public static void startGame(String rule, String[][] questionsAndAnswers) {
        printMessage(rule);
        startQuiz(questionsAndAnswers);
    }

    public static void startQuiz(String[][] questionsAndAnswers) {
        for (String[] questionAndAnswer : questionsAndAnswers) {
            printQuestion(questionAndAnswer[0]);
            printAnswer();
            String answer = scanner.next();
            checkAnswer(answer, questionAndAnswer[1]);
        }
        winGame();
    }

    public static void printQuestion(String question) {
        printMessage("Question: " + question);
    }

    public static void printAnswer() {
        printMsg("Your answer: ");
    }

    public static void checkAnswer(String answer, String correctAnswer) {
        if (answer.equals(correctAnswer)) {
            correctAnswer();
        } else {
            wrongAnswer(answer, correctAnswer);
            endGame();
        }
    }

    public static void correctAnswer() {
        printMessage("Correct!");
    }

    public static void wrongAnswer(String answer, String correctAnswer) {
        printMessage("'" + answer + "' is wrong answer ;(. Correct answer was " + "'" + correctAnswer + "'.");
    }

    public static void printError(String answer) {
        printMessage("Unknown symbol " + answer);
        System.exit(0);
    }

    public static void winGame() {
        printMessage("Congratulations, " + userName + "!");
    }

    public static void endGame() {
        printMessage("Let's try again, " + userName + "!");
        System.exit(0);
    }

    public static void printMessage(String msg) {
        System.out.println(msg);
    }

    public static void printMsg(String msg) {
        System.out.print(msg);
    }
}
