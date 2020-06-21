package jborn.s03;
/*
Инверсия строки.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task08 {
    public static void main(String[] args) throws Exception {
        StringBuilder str = new StringBuilder ();
        System.out.println("Введите строку");
        String charBook = readString();
        char[] charArr = charBook.toCharArray();

        for (int i = charArr.length-1; i >= 0 ; i--) {
            str.append (charArr[i]) ;
            System.out.print (charArr[i]);
        }
    }

    public static String readString() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }

}