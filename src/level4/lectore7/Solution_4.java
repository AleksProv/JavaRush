package level4.lectore7;

//вывести количество положительных и отрицательных чисел.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_4 {
    public static void main (String[] args) throws Exception {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        System.out.println ("Введите число 1");
        int t1 = Integer.parseInt (reader.readLine ());
        System.out.println ("Введите число 2");
        int t2 = Integer.parseInt (reader.readLine ());
        System.out.println ("Введите число 3");
        int t3 = Integer.parseInt (reader.readLine ());
        int countPol = 0;
        int countOtr = 0;

        if (t1 > 0)
            countPol++;
        else
            countOtr++;
        if (t2 > 0)
            countPol++;
        else
            countOtr++;
        if (t3 > 0)
            countPol++;
        else
            countOtr++;

        System.out.println ("количество положительных чисел: " + countPol);
        System.out.println ("количество отрицательных чисел: " + countOtr);
    }
}
