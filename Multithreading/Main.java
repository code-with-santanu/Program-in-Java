
public class Main {
    
    public static void main(String[] args)
    {
        CreateThread th = new CreateThread();

        th.start();

         for(int i=0;i<10;i++)
        {
            System.out.println("I am main thread");
        }
    }
}
