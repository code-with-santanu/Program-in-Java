import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String str, rep, repWith;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the String: ");
        str = in.nextLine();

        System.out.println("Enter string to replace and string to replace with: ");
        rep = in.nextLine();
        repWith = in.nextLine();

        in.close();

        ReplaceString obj = new ReplaceString();
        String newString = obj.replace(str, rep, repWith);
        System.out.println("After Replacement = " + newString);
    }
}
