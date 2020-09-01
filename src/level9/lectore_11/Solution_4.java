package level9.lectore_11;

/*
Какое сегодня число? ввести с клавиатуры 2018-08-21, вывести в консоль AUG 21, 2018
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;


public class Solution_4 {
    public static void main (String[] args) throws Exception {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        String dateInString = reader.readLine ();
        SimpleDateFormat formatter = new SimpleDateFormat ("y-M-d", Locale.ENGLISH);
        Date date = formatter.parse (dateInString);
        System.out.println ((new SimpleDateFormat ("MMM dd, yyyy", Locale.ENGLISH).format (date)).toUpperCase ());
    }
}