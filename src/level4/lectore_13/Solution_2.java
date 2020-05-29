package level4.lectore_13;

//Вывести прямоугольник размером m на n из восьмерок.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_2 {
    public static void main (String[] args) throws Exception {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        System.out.println ("Введите число m");
        int m = Integer.parseInt (reader.readLine ());
        System.out.println ("Введите число n");
        int n = Integer.parseInt (reader.readLine ());

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print (8);
            }
            System.out.println (" ");
        }
    }
}
