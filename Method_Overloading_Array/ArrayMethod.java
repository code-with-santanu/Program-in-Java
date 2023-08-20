import java.util.Scanner;

public class ArrayMethod {
    public void insertValue(int arr[], int length) {
        Scanner inp = new Scanner(System.in);

        System.out.println("Enter the elements");
        for (int i = 0; i < length; i++) {
            arr[i] = inp.nextInt();
        }
    }

    public void PrintArray(int arr[], int length) {
        for(int i= 0; i<length;i++)
        {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }
}
