package arjun;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ConvertDateToString {
    public String convert(Date date) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        return formatter.format(date);
    }
}
