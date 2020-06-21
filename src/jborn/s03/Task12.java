package jborn.s03;
/*
Из консоли вводится строка и символ. Строка разбивается разделителями (символ) на подстроки.
Вывести на экран все подстроки с указанием их длины.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task12 {
    public static void main (String[] args) throws Exception {
        String[] regul = {"(", ")", "[", "]", "/", "$", "^", ".", "|", "?", "*", "+", "{", "}", "\\"};
        System.out.println ("Введите строку");
        String nameBook = readString ();
        System.out.println ("Введите символ");
        String charBook = readString ();
        for (int i = 0; i < regul.length; i++) {
            if (charBook.equals (regul[i]))
                charBook = String.format ("\\%s", charBook);
        }
        String[] split = nameBook.split (charBook);
        for (String s : split) {
            System.out.println (s + " - " + s.length ());
        }
    }

    public static String readString () throws Exception {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        return reader.readLine ();
    }

}