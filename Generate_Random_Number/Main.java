import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        RandomNumberWithinRange obj = new RandomNumberWithinRange();
        Scanner inp = new Scanner(System.in);

        System.out.println("Enter the min and max value of the range: ");
        int min = inp.nextInt();
        int max = inp.nextInt();

        int randomValue = obj.getRandomNumber(min, max);

        System.out.println("The random value is: "+ randomValue);
        
    }
}
