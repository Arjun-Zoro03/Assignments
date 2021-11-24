package arjun;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of inputs: ");
        int numberOfInputs = sc.nextInt();
        sc.nextLine();//Skip the remainder of the line

        KycFormDates kycFormDates = new KycFormDates();
        ConvertStringToDate convertStringToDate = new ConvertStringToDate();

        System.out.println("Enter " + numberOfInputs + " SignUp and Current dates: ");

        String[] datesList = new String[numberOfInputs];
        for (int i=0; i < numberOfInputs; i++)
            datesList[i] = sc.nextLine();

        for (int i=0; i < numberOfInputs; i++){
            String[] dates = datesList[i].split(" "); //taking two date inputs
            Date signUpDate = convertStringToDate.convert(dates[0]);
            Date currentDate = convertStringToDate.convert(dates[1]);
            kycFormDates.displayAllowableDateRange(signUpDate,currentDate);
        }
    }
}
