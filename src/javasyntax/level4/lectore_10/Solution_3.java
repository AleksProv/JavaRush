package javasyntax.level4.lectore_10;

//Вывести строку N раз.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_3 {
    public static void main (String[] args) throws Exception {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        System.out.println ("Введите строку");
        String stroka = reader.readLine ();
        System.out.println ("Введите число");
        int number = Integer.parseInt (reader.readLine ());

        while (number > 0) {
            System.out.println (stroka);
            number--;
        }
    }
}
