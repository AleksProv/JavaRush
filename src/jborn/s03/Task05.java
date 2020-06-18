package jborn.s03;
/*
Определить является ли строка палиндромом.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task05 {
    public static void main(String[] args) throws Exception {
        System.out.println("Введите слово");
        String nameBook = readString();
        String bookName = new StringBuffer(nameBook).reverse().toString();
        if (nameBook.equals(bookName))
            System.out.println("Является палиндромом");
        else
            System.out.println("Не является палиндромом");
    }

    public static String readString() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }

}