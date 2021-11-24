package com.arjun.arjun;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchFile {
    public void search(File path, String patternOfTheFileToBeSearched) {
        Pattern patter = Pattern.compile(patternOfTheFileToBeSearched);
        File[] files = path.listFiles();


        for(File file:files){
            Matcher matcher = patter.matcher(file.getName());
            if(file.isDirectory())
                search(file, patternOfTheFileToBeSearched);
            else if(matcher.matches())
                System.out.println("Matched path's are "+file.getAbsolutePath());
        }

    }
}

