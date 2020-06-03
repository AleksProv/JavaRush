package level5.lectore_12;

/*
Вывести на экран сегодняшнюю дату.
 */

import java.util.Date;
import java.text.SimpleDateFormat;

public class Solution_3 {
    public static void main (String[] args) {
        Date date = new Date ();
        SimpleDateFormat format1 = new SimpleDateFormat ("dd MM yyyy");
        System.out.println (format1.format (date));
    }
}
