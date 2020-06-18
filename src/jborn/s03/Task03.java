package jborn.s03;
/*
Вывести в консоле строки, состоящие из введенных символов.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task03 {
    public static void main(String[] args) throws Exception {
        System.out.println("Введите слово");
        String nameBook = readString();
        for (int i = 0; i < nameBook.length(); i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(nameBook.charAt(i));
            }
            System.out.println(" ");
        }

    }

    public static String readString() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }

}