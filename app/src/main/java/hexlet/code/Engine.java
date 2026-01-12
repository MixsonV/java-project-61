package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public final class Engine {
    private static final int DEFAULT_MIN_RANGE = 1;
    private static final int DEFAULT_MAX_RANGE = 100;
    private static final int DEFAULT_ROUNDS = 3;

    private String userName;
    private int minRange;
    private int maxRange;
    private int rounds;
    private Scanner scanner;
    private Random random;

    public Engine() {
        userName = Cli.getUserName();
        minRange = DEFAULT_MIN_RANGE;
        maxRange = DEFAULT_MAX_RANGE;
        rounds = DEFAULT_ROUNDS;
        scanner = new Scanner(System.in);
        random = new Random();
    }

    public int getRounds() {
        return rounds;
    }

    public void setMinRange(int newMinRange) {
        if (newMinRange >= maxRange) {
            setMaxRange(newMinRange + 1);
        }
        this.minRange = newMinRange;
    }

    public void setMaxRange(int newMaxRange) {
        if (newMaxRange <= minRange) {
            setMinRange(newMaxRange - 1);
        }
        this.maxRange = newMaxRange;
    }

    // get random number in range [this.minRange, this.maxRange]
    public int getRandomNumberLockedRange() {
        return getRandomNumber(minRange, maxRange) + 1;
    }

    // get random number in range [0, maxRange]
    public int getRandomNumber(int newMaxRange) {
        return random.nextInt(newMaxRange);
    }

    // get random number in range [minRange, maxRange]
    public int getRandomNumber(int newMinRange, int newMaxRange) {
        return random.nextInt(newMinRange, newMaxRange);
    }

    public void startQuiz(Object[][] quiz) {
        for (Object[] objects : quiz) {
            printQuestion(objects[0].toString());
            printAnswer();
            String answer = scanner.next();
            checkAnswer(answer, objects[1].toString());
        }
        winGame();
    }

    public void printQuestion(String question) {
        printMessage("Question: " + question);
    }

    public void printAnswer() {
        printMsg("Your answer: ");
    }

    public void checkAnswer(String answer, String correctAnswer) {
        if (answer.equals(correctAnswer)) {
            correctAnswer();
        } else {
            wrongAnswer(answer, correctAnswer);
            endGame();
        }
    }

    public void correctAnswer() {
        printMessage("Correct!");
    }

    public void wrongAnswer(String answer, String correctAnswer) {
        printMessage("'" + answer + "' is wrong answer ;(. Correct answer was " + "'" + correctAnswer + "'.");
    }

    public void printError(Object answer) {
        printMessage("Unknown symbol " + answer);
    }

    public void winGame() {
        printMessage("Congratulations, " + userName + "!");
    }

    public void endGame() {
        printMessage("Let's try again, " + userName + "!");
        System.exit(0);
    }

    public void printMessage(Object msg) {
        System.out.println(msg);
    }

    public void printMsg(Object msg) {
        System.out.print(msg);
    }
}
