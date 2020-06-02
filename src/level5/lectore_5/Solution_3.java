package level5.lectore_5;

/*
Ввести с клавиатуры числа и при вводе -1 посчитать среднеарифмитическое введеных чисел без учета -1.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_3 {
    public static void main (String[] args) throws Exception {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        double summ = 0.0;
        int count = 0;
        while (true) {
            System.out.println ("Введите целое число");
            int n = Integer.parseInt (reader.readLine ());
            if (n != -1) {
                summ += n;
                count++;
            } else {
                System.out.println (summ / count);
                break;
            }
        }
    }
}