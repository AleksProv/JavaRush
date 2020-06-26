package jborn.s03;
/*
Из консоли вводится выражение: "d1 + d2 + d3 + d4 + d5" (может быть больше чем 5).
Найти результат вычисления данного выражения.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task14 {
    public static void main (String[] args) throws Exception {
        int summa = 0;
        String str = readString ();
        String[] split = str.split ("\\+");
        for (String s : split) {
            summa += Integer.parseInt (s);
        }
        System.out.println (summa);
    }

    public static String readString () throws Exception {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        return reader.readLine ();
    }

}