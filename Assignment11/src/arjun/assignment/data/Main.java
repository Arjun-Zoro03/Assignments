package arjun.assignment.data;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String fileName = args[0];
        Scanner inFile;
        String fileData = "";

        try {
            inFile = new Scanner(new File(fileName));
            while (inFile.hasNext())
                fileData += inFile.nextLine();
            inFile.close();
        }

        catch (FileNotFoundException ex) {
            System.out.println("File not found!!!");
        }

        CharCount charCount = new CharCount();
        charCount.writeCharCount(fileData);


    }
}
