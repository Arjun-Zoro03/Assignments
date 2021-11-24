package arjun.assignment.data;

import java.util.ArrayList;
import java.util.Collections;

/*
ALGORITHM:
    ->Take two numbers
    ->Check if they are of same length
    ->If num1 * 10 > num2 or num2 * 10 > num1, they are of same length
    ->If condition is satisfied,
        take all digits of their product and all the digits in the individuals fangs
    ->Sort them as strings and compare, their equality confirms the product is a vampire
 */

public class Print100VampireNumbers {

    public static void main(String[] args) {
        test(10,1000);
    }

    static void test(int  startValue,  int  stopValue) {
        int count = 1;
        StringBuilder res = new StringBuilder();

        outer:
        for (int fangA = startValue; fangA <= stopValue; fangA++) {
            inner:
            for (int fangB = fangA; fangB <= stopValue; fangB++) {
                if (isVampireNumber(fangA, fangB,true)) {
                    count++;
                    res.append("" + count + ": = ( " + fangA + "," + fangB + " = " + fangA*fangB + ")" + "\n");
                }
                if (count == 100)
                    break outer;
            }
        }
        System.out.println(res);
    }

    static boolean isVampireNumber(int fangA, int fangB, boolean noPseudoVampireNumbers ) {

        //if the fangs are not of same length
        if (noPseudoVampireNumbers) {
            if (fangA * 10 <= fangB || fangB * 10 <= fangA) {
                return false;
            }
        }

        String mulDigits = splitIntoDigits(fangA*fangB,0); //digits in product of fangs
        String factorDigits = splitIntoDigits(fangA,fangB); //all the digits in both the fangs

        //condition to check if the above strings have same digits making it a vampire number
        return mulDigits.equals(factorDigits);
    }

    static String splitIntoDigits(int num1, int num2) {

        StringBuilder res = new StringBuilder();//converting all digits to a single string
        ArrayList<Integer> digits = new ArrayList<>(); //store all the digits

        while (num1 > 0) {
            digits.add(num1 % 10);
            num1 /= 10;
        }

        while (num2 > 0) {
            digits.add(num2 % 10);
            num2 /= 10;
        }

        Collections.sort(digits);//sorting to ensure accurate string comparison
        for (int i : digits) {
            res.append(i);
        }

        return res.toString();
    }
}