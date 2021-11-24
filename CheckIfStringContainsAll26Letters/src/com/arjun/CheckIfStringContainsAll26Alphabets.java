package com.arjun;

public class CheckIfStringContainsAll26Alphabets {
    public boolean check(String inputString) {
        inputString = inputString.toLowerCase();
        int index = 0;
        boolean[] letterVisited = new boolean[26];

        for (int i = 0; i < inputString.length(); i++) {
            if ('a' <= inputString.charAt(i) && inputString.charAt(i) <= 'z')
                index = inputString.charAt(i) - 'a';
                letterVisited[index] = true;
        }

        for (int i = 0; i < 26; i++) {
            if (!letterVisited[i]) {
                return false;
            }
        }
        return true;
    }
}
