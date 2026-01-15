package hexlet.code;

import java.util.Scanner;

public final class Engine {
    public static final int DEFAULT_ROUNDS = 3;

    public static void startGame(String rule, String[][] questionsAndAnswers) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        // правила
        System.out.println(rule);
        // перебор вопросов
        for (String[] questionAndAnswer : questionsAndAnswers) {
            // вывод вопроса
            System.out.println("Question: " + questionAndAnswer[0]);
            // ввод ответа
            System.out.print("Your answer: ");
            String answer = scanner.next();
            String correctAnswer = questionAndAnswer[1];
            // проверка ответа
            if (answer.equals(correctAnswer)) {
                // вывод правильного ответа
                System.out.println("Correct!");
            } else {
                // вывод неправильного и правильного ответов и завершение игры
                System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.%n", answer, correctAnswer);
                System.out.println("Let's try again, " + userName + "!");
                System.exit(0);
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
