import java.util.Random;

public class RandomNumberWithinRange {

    private Random rand = new Random();

    public int getRandomNumber(int max)
    {
        return rand.nextInt(max);
    }


    public int getRandomNumber(int min, int max) {
        
        return rand.nextInt(max - min + 1) + min;
    }
}
