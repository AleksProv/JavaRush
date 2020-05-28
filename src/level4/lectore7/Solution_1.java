package level4.lectore7;

//описание введенного числа

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_1 {
    public static void main (String[] args) throws Exception {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        System.out.println ("Введите целое число ");
        int t1 = Integer.parseInt (reader.readLine ());

        if (t1 != 0) {

            if (t1 % 2 == 0)
                System.out.print ("четное");
            else
                System.out.print ("нечетное");
            if (t1 > 0)
                System.out.println (" положительное число");
            else
                System.out.println (" отрицательное число");

        } else {
            System.out.println ("ноль");
        }
    }
}
