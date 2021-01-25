package javasyntax.level6.lectore_5;

/*
Четные и нечетные циферки. Вывести количество четных и нечетных у введенного числа.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_2 {
    public static int even;
    public static int odd;

    public static void main (String[] args) throws IOException {

        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        String numb = reader.readLine ();

        for (int i = 0; i < numb.length (); i++) {
            int n = Character.digit (numb.charAt (i), 10);
            if (((double) n / 2 - n / 2 == 0))
                even++;
            else
                odd++;
        }
        System.out.println ("Even: " + even + " " + "Odd: " + odd);
    }
}