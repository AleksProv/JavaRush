package jborn.s03;
/*
Из консоли вводится массив строк. Вывести все введенные строки через запятую.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task09 {
    public static void main (String[] args) throws Exception {
        StringBuilder stringBuilder = new StringBuilder ();
        System.out.println ("Введите колличество строк");
        int n = readInt ();
        String[] arrStr = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println ("Введите строку " + (i + 1));
            arrStr[i] = readString ();
            if (i == n - 1)
                stringBuilder.append (arrStr[i]);
            else
                stringBuilder.append (arrStr[i]).append (", ");
        }
        System.out.println ("Результат: " + stringBuilder);
    }

    public static String readString () throws Exception {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        return reader.readLine ();
    }

    public static int readInt () throws Exception {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        return Integer.parseInt (reader.readLine ());
    }

}