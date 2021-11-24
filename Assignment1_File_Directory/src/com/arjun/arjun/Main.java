package com.arjun.arjun;

import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        SearchFile searchFile = new SearchFile();
        Scanner sc = new Scanner(System.in);
        File directory = new File("/home/arjung/Assignment5");

        System.out.println("Enter 0 for exit:");
        String patternOfTheFileToBeSearched = sc.nextLine();
        while(!patternOfTheFileToBeSearched.equals("0")){
            searchFile.search(directory,patternOfTheFileToBeSearched);
            patternOfTheFileToBeSearched = sc.nextLine();
        }
    }
}


