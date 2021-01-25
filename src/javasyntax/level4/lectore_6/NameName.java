package javasyntax.level4.lectore_6;

/*
  Ввести с клавиатуры два имени, и если имена одинаковые вывести ссобщение "Имена идетнтичны"
  Если имена разные, но их длины равны, вывести "Длины имен равны"
 */

import java.io.InputStreamReader;
import java.io.BufferedReader;

public class NameName {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите имя 1");
        String t1 = reader.readLine();
        System.out.println("Введите имя 2");
        String t2 = reader.readLine();

        if (t1.trim().equals(t2.trim()))
            System.out.println(t1.trim() + " " + t2.trim() + " Имена идентичны");
        else if (!t1.equals(t2) && t1.length() == t2.length())
            System.out.print("Длины имен равны ");
    }
}