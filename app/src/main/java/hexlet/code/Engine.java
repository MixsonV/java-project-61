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
        userName = "Unknown Player";
        minRange = DEFAULT_MIN_RANGE;
        maxRange = DEFAULT_MAX_RANGE;
        rounds = DEFAULT_ROUNDS;
        scanner = new Scanner(System.in);
        random = new Random();
    }

    public int getRounds() {
        return rounds;
    }

    public Scanner getScanner() {
        return scanner;
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

    public int getMinRange() {
        return minRange;
    }

    public int getMaxRange() {
        return maxRange;
    }

    public void setUserName(String newUserName) {
        userName = newUserName;
    }

    public String getUserName() {
        return userName;
    }

    // get random number in range [this.minRange, this.maxRange]
    public int getRandomNumberLockedRange() {
        return getRandomNumber(minRange, maxRange) + 1;
    }

    // get random number in range [0, maxRange]
    public int getRandomNumber(int newMaxRange) {
        return random.nextInt(maxRange);
    }

    // get random number in range [minRange, maxRange]
    public int getRandomNumber(int newMinRange, int newMaxRange) {
        return random.nextInt(newMinRange, newMaxRange);
    }

    public void meetingPlayer() {
        System.out.println("Welcome to the Brain Games!");
        Cli.greetsThePlayer();
    }

    public void winGame() {
        System.out.println("Congratulations, " + userName + "!");
    }

    public void endGame() {
        System.out.println("Let's try again, " + userName + "!");
        System.exit(0);
    }

    public void printQuestion(String question) {
        System.out.println("Question: " + question);
    }

    public void printAnswer(String answer) {
        System.out.println("Your answer: " + answer);
    }

    public void correctAnswer() {
        System.out.println("Correct!");
    }

    public void wrongAnswer(String answer, String correctAnswer) {
        System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was " + "'" + correctAnswer + "'.");
    }

    public void printRule(String rule) {
        System.out.println(rule);
    }
}
