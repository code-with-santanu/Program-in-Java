import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Main {

    
    public static void main(String[] args) throws IOException
    {
        System.out.println("Enter the file name: ");
        Scanner inp = new Scanner(System.in);
        String fileName = inp.nextLine();
        
        CreateFile objFile = new CreateFile();
        objFile.createExcel(fileName);

        // System.out.println("Enter your messege");
        // Scanner input = new Scanner(System.in);

        // WriteData filewrite = new WriteData();
        // filewrite.writeData(fileName, input.nextLine());

        // ReadData file = new ReadData();
        // file.readData(fileName);



        

    }


    }

