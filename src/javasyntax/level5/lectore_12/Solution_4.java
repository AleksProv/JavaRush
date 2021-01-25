package javasyntax.level5.lectore_12;

/*
Консоль-копилка.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_4 {
    public static void main (String[] args) throws Exception {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        int summ = 0;
        while (true) {
            String s = reader.readLine ();
            if (s.equals ("сумма")) {
                System.out.println (summ);
                break;
            }
            int n = Integer.parseInt (s);
            summ += n;
        }
    }
}