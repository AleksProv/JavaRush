package level5.lectore_12;

/*
Задача по алгоритмам I Java Syntax: 5 уровень, 12 лекция. Вывести максимальное из n введеных чисел.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_7 {
    public static void main (String[] args) throws Exception {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        int maximum = 0;
        int n = Integer.parseInt (reader.readLine ());
        if (n > 0) {
            while (n > 0) {
                int numb = Integer.parseInt (reader.readLine ());
                if (numb < 0 && maximum == 0)
                    maximum = numb;
                if (numb >= maximum)
                    maximum = numb;
                n--;
            }
            System.out.println (maximum);
        }
    }
}