package jborn.s03;
/*
Определить является ли строка палиндромом.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Objects;

public class Task06 {
    public static void main(String[] args) throws Exception {
        System.out.println("Введите строку");
        String nameBook = readString();
        System.out.println("Введите символ");
        String charBook = readString();
        char[] charArr = nameBook.toCharArray();

        int count = 0;
        for (char element : charArr) {
            if (Character.toString(element).equals(charBook))
                count++;
        }
        System.out.println("Колличество вхождений: " + count);
        System.out.println("Преобразованная строка: " + nameBook.replace(charBook, charBook.toUpperCase()));
    }

    public static String readString() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }

}