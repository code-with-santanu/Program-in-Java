import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class ReadData {
    
    private String data="";

    public void readData(String fileName)
    {
        try{
            File obj = new File(fileName);
            Scanner inp = new Scanner(obj);
            
            while(inp.hasNextLine())
            {
                this.data = inp.nextLine();
                System.out.println(this.data);
            }
            inp.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("An error Occured");
            e.printStackTrace();
        }
    }
}