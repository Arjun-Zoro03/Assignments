package arjun.assignment.data;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class CharCount {
    public void writeCharCount(String fileData){
        HashMap<Character, Integer> charCountMap
                = new HashMap<Character, Integer>();

        char[] strArray = fileData.toCharArray();

        for (char c : strArray) {
            if (c == ' ')
                continue;
            if (charCountMap.containsKey(c))
                charCountMap.put(c, charCountMap.get(c) + 1);
            else
                charCountMap.put(c, 1);
        }

        try{
            PrintWriter pw = new PrintWriter("SaveCharCount.txt");

            for (Map.Entry entry : charCountMap.entrySet()) {
                pw.println(entry.getKey() + " " + entry.getValue());
            }

            pw.close();
        }

        catch (FileNotFoundException ex){
            System.out.println("Could not save char count");
        }

    }
}
