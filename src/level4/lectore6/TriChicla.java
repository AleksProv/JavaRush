package level4.lectore6;

/*
 Вывести порядклвый номер числа, отличного от равных других.
 */

import java.io.InputStreamReader;
import java.io.BufferedReader;

public class TriChicla {

    public static void main(String[] args) throws Exception {
        String num = ""; // порядковый номер
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число 1");
        int t1 = Integer.parseInt(reader.readLine());
        System.out.println("Введите число 2");
        int t2 = Integer.parseInt(reader.readLine());
        System.out.println("Введите число 3");
        int t3 = Integer.parseInt(reader.readLine());


        if (t1 == t2 && t1 != t3)
            num = "3";
         else if (t1 == t3 && t2 != t1)
            num = "2";
         else if (t2 == t3 && t2 != t1)
            num = "1";

        System.out.println("Порядковый номер - " + num);

    }
}
