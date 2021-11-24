package arjun;

import java.util.Calendar;
import java.util.Date;

public class KycFormDates {
    public void displayAllowableDateRange(Date signUpDate, Date currentDate){

        if (signUpDate.after(currentDate)) {
            System.out.println("No range");
            return;
        }

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(signUpDate);

        Calendar temp = Calendar.getInstance();
        temp.setTime(currentDate);
        int currentYear = temp.get(Calendar.YEAR);

        temp.setTime(signUpDate);
        int signUpYear = temp.get(Calendar.YEAR);

        int differenceInYears = currentYear - signUpYear;

        calendar.add(Calendar.YEAR, differenceInYears);
        calendar.add(Calendar.DATE, -30);
        Date lowerRange = calendar.getTime();
        calendar.add(Calendar.DATE,60);
        Date upperRange = calendar.getTime();

        ConvertDateToString convertDateToString = new ConvertDateToString();

        if (currentDate.after(lowerRange) && currentDate.before(upperRange))
            System.out.println(convertDateToString.convert(lowerRange) + " " + convertDateToString.convert(currentDate));
        else
            System.out.println(convertDateToString.convert(lowerRange) + " " + convertDateToString.convert(upperRange));
    }
}
