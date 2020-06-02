package level4.lectore_16;

//Ввести с клавиатуры Имя, дату рождения из трех чисел и вывести.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_4 {
    public static void main (String[] args) throws Exception {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        System.out.println ("Введите имя");
        String name = reader.readLine ();
        System.out.println ("Введите число рождения");
        int n1 = Integer.parseInt (reader.readLine ());
        System.out.println ("Введите месяц рождения");
        int n2 = Integer.parseInt (reader.readLine ());
        System.out.println ("Введите год рождения");
        int n3 = Integer.parseInt (reader.readLine ());
        System.out.println ("Меня зовут " + name);
        System.out.println ("Я родился " + n3 + "." + n2 + "." + n1);
    }
}
