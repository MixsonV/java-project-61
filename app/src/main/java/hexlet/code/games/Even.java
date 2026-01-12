package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    private static final String RULE = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void start() {
        Engine engine = new Engine();
        engine.printMessage(RULE);

        Object[][] objects = new Object[engine.getRounds()][2];
        for (var i = 0; i < engine.getRounds(); i++) {
            int number = engine.getRandomNumberLockedRange();
            objects[i] = new Object[]{number, number % 2 == 0 ? "yes" : "no"};
        }

        engine.startQuiz(objects);
    }
}
