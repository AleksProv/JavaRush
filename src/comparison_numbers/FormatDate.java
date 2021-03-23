package comparison_numbers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class FormatDate {
    public static void main(String[] args) throws ParseException {
        String line = "31 12 1950";
        String[] str = line.split(" ");
        Calendar calendar = new GregorianCalendar(Integer.parseInt(str[2]), Integer.parseInt(str[1])-1, Integer.parseInt(str[0]));
        System.out.println(calendar.getTime());

//        String strDate = "31/12/1950";
//        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
//        Date birthDate = formatter.parse(strDate);
//        System.out.println(formatter.format(birthDate));
    }
}
