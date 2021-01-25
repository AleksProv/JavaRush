package javasyntax.level4.lectore_16;

//Ввести с клавиатуры числа и при вводе -1 посчитать сумму введеных чисел с учетом -1.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_3 {
    public static void main (String[] args) throws Exception {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        int summ = 0;
        while (true) {
            System.out.println ("Введите число");
            int n = Integer.parseInt (reader.readLine ());
            summ += n;
            if (n == -1) {
                System.out.println (summ);
                break;
            }
        }
    }
}
