package jborn.s03;
/*
Из консоли вводится строка, содержащая слова разделённые последовательностями пробелов.
Необходимо убрать все лишние пробелы и вернуть изменённую строку.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task13 {
    public static void main (String[] args) throws Exception {
        String str = readString ();
        str = str.replaceAll ("\\s+", " ").trim ();

        // Удаляет пробел между концом предложения и точкой. Не факт, что нужно было по заданию.
        if (!Character.isLetter (str.charAt (str.length () - 1))) {
            str = str.substring (0, str.length () - 2).concat (str.substring (str.length () - 1));
        }
        System.out.println (str);
    }

    public static String readString () throws Exception {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        return reader.readLine ();
    }

}