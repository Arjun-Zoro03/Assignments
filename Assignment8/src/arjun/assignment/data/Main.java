package arjun.assignment.data;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        try{
            int age = sc.nextInt();
            if (age < 0)
                throw new NegativeNumberException();
            if (age < 18)
                throw new MinorException();
            if (age > 60)
                throw new SeniorCitizen();
        }

        catch (SeniorCitizen | NegativeNumberException | MinorException ex ){

        }
    }
}
