

public class CreateThread extends Thread{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("I am child thread");
        }
    }
}
