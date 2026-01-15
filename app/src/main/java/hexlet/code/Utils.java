package hexlet.code;

import java.util.Random;

public class Utils {
    private static final Random RANDOM = new Random();

    // get random number in range [0, MaxRange - 1]
    public static int getRandomNumber(int maxRange) {
        return RANDOM.nextInt(maxRange) + 1;
    }

    // get random number in range [MinRange, MaxRange - 1]
    public static int getRandomNumber(int minRange, int maxRange) {
        return RANDOM.nextInt(minRange, maxRange) + 1;
    }
}
