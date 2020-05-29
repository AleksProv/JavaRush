package level4.lectore_13;

//Ввести с клавиатуры Имя и используя For 10 раз вывести: name любит меня.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_5 {
    public static void main (String[] args) throws Exception {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        System.out.println ("Введите имя");
        String name = reader.readLine ();

        for (int i = 0; i < 10; i++)
            System.out.println (name + " любит меня.");
    }
}
