import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String str1, str2;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter first string:");
        str1 = in.nextLine();

        System.out.println("Enter second string:");
        str2 = in.nextLine();

        in.close();

        CompareString obj = new CompareString(str1, str2);

        if ( str1.compareTo(str2) > 0 )
            System.out.println("First string is greater than second.");
        else if ( str1.compareTo(str2) < 0 )
            System.out.println("First string is smaller than second.");
        else 
            System.out.println("Both strings are equal.");

    }
}
