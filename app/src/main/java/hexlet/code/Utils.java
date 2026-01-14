package hexlet.code;

import java.util.Random;

public class Utils {
    private static final int DEFAULT_MIN_RANGE = 1;
    private static final int DEFAULT_MAX_RANGE = 100;
    private static final Random RANDOM = new Random();

    // get random number in range [DEFAULT_MIN_RANGE, DEFAULT_MAX_RANGE]
    public static int getRandomNumberLockedRange() {
        return getRandomNumber(DEFAULT_MIN_RANGE, DEFAULT_MAX_RANGE) + 1;
    }

    // get random number in range [0, MaxRange - 1]
    public static int getRandomNumber(int MaxRange) {
        return RANDOM.nextInt(MaxRange);
    }

    // get random number in range [MinRange, MaxRange - 1]
    public static int getRandomNumber(int MinRange, int MaxRange) {
        return RANDOM.nextInt(MinRange, MaxRange);
    }
}
