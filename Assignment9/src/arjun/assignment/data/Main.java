package arjun.assignment.data;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile("^[A-Z].*[.]{1}$");
        Matcher matcher = pattern.matcher(input);
        if(matcher.matches())
            System.out.println("It's begins with a capital letter and ends with a period.");
        else
            System.out.println("It doesn't begins with a capital letter and end with a period.");
        }
}
