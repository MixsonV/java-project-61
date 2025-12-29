package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    private static final String RULE = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void start(Engine engine) {
        engine.printRule(RULE);

        for (var i = 0; i < engine.getRounds(); i++) {
            int number = engine.getRandomNumberLockedRange();
            engine.printQuestion(number + " is even?");
            String answer = engine.getScanner().next();
            engine.printAnswer(answer);
            if (number % 2 == 0 && answer.equals("yes") || number % 2 != 0 && answer.equals("no")) {
                engine.correctAnswer();
            } else {
                String correctAnswer = answer.equals("yes") ? "no" : "yes";
                engine.wrongAnswer(answer, correctAnswer);
                engine.endGame();
            }
        }

        engine.winGame();
    }
}
