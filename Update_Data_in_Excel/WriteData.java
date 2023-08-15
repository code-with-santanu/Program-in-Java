import java.io.FileWriter;
import java.io.IOException;

public class WriteData {
    
    public void writeData(String fileName,String msg)
    {
        try{
        FileWriter obj = new FileWriter(fileName);
        obj.write(msg);
        obj.close();

        System.out.println("Successfully written");
            
            
        }
        catch(IOException e){
            System.out.println("An error Occured");
            e.printStackTrace();
        }
    }
}
