import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int count =5;
        System.out.println("Enter the size of the array: ");
        Scanner inp = new Scanner(System.in);

        int n = inp.nextInt();  //always take greater than 8

        int[] arr = new int[n]; 
        ArrayMethod obj = new ArrayMethod();
        obj.insertValue(arr, 5);
        obj.PrintArray(arr, 5);

        InsertInArray inObj = new InsertInArray();

        System.out.println("Enter the value to insert at the beginning: ");
        count = inObj.insert(arr, count, inp.nextInt(), true);
        obj.PrintArray(arr, count);

        System.out.println("Enter the value to insert at end: ");
        count = inObj.insert(arr, count, inp.nextInt(), false);
        obj.PrintArray(arr, count);

        System.out.println("Enter the value and position to insert at the middle: ");
        count = inObj.insert(arr, count, inp.nextInt(), inp.nextInt());
        obj.PrintArray(arr, count);

    }

}
