package com.arjun;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString;

        System.out.println("Enter any string:");
        inputString = sc.nextLine();

        CheckIfStringContainsAll26Alphabets checkIfStringContainsAll26Letters = new CheckIfStringContainsAll26Alphabets();

        if (checkIfStringContainsAll26Letters.check(inputString) == true)
            System.out.println("The string contains all 26 letters of the alphabet");
        else
            System.out.println("The given string does not contain all 26 letters of the alphabet.");
    }
}
