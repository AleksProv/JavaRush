package level8.lectore_11;

/*
Работа с датой.
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Solution_8 {
    public static void main (String[] args) throws ParseException {
        System.out.println (isDateOdd ("MAY 1 2013"));
        System.out.println (isDateOdd2 ("MAY 1 2013"));
    }

    public static boolean isDateOdd (String date) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat ("MMM d yyyy", Locale.ENGLISH);
        String dateOne = date;
        String dateTwo = "JAN 1 ";
        Date date1 = formatter.parse (dateOne);
        Calendar calendar = Calendar.getInstance ();
        calendar.setTime (date1);
        dateTwo += calendar.get (Calendar.YEAR);
        Date date3 = formatter.parse (dateTwo);
        long difference = date1.getTime () - date3.getTime ();
        int days = (int) (difference / (24 * 60 * 60 * 1000)) + 1; // миллисекунды / (24ч * 60мин * 60сек * 1000мс)
        return days % 2 != 0;
    }

    public static boolean isDateOdd2 (String date) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat ("MMM d yyyy", Locale.ENGLISH);
        Calendar calendar = new GregorianCalendar ();
        calendar.setTime (formatter.parse (date));
        return calendar.get (Calendar.DAY_OF_YEAR) % 2 !=0;
    }
}