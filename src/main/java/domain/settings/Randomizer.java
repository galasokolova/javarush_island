package domain.settings;

import java.util.concurrent.ThreadLocalRandom;

public class Randomizer {
    public static int getRandom(int min, int max){
        return ThreadLocalRandom.current().nextInt(min,max+1);
    }
    public static boolean getProbability(int percent) {return getRandom(0, 100) < percent;}

}
