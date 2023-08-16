import java.io.IOException;

public class Notepad {

    public void openNotepad()
    {
        Runtime rs = Runtime.getRuntime();
        try {
        rs.exec("notepad");
        }
        catch (IOException e) {
        System.out.println(e);
        }
    }
}
