package jborn.s03;
/*
Символы верхнего регистра заменить на нижний и наоборот.
 */

import javax.swing.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task07 {
    public static void main(String[] args) throws Exception {
        System.out.println("Введите строку");
        String charBook = readString();
        char[] charArr = charBook.toCharArray();
        for (char element : charArr) {
            if (Character.toUpperCase (element) == element)
                element = Character.toLowerCase (element);
            else
                element = Character.toUpperCase (element);
            System.out.print (element);
        }
    }

    public static String readString() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }

}