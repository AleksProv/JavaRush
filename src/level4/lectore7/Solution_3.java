package level4.lectore7;

// вывести количество положительных чисел

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_3 {
    public static void main (String[] args) throws Exception {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        System.out.println ("Введите число 1");
        int t1 = Integer.parseInt (reader.readLine ());
        System.out.println ("Введите число 2");
        int t2 = Integer.parseInt (reader.readLine ());
        System.out.println ("Введите число 3");
        int t3 = Integer.parseInt (reader.readLine ());
        int count = 0;

        if (t1 > 0)
            count++;
        if (t2 > 0)
            count++;
        if (t3 > 0)
            count++;

        System.out.println (count);
    }
}