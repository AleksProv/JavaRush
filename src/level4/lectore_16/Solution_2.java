package level4.lectore_16;

//Ввести три числа и вывести среднее из них. Если числа равны, вывести любое.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_2 {
    public static void main (String[] args) throws Exception {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        System.out.println ("Введите первое число");
        int n1 = Integer.parseInt (reader.readLine ());
        System.out.println ("Введите второе число");
        int n2 = Integer.parseInt (reader.readLine ());
        System.out.println ("Введите третье число");
        int n3 = Integer.parseInt (reader.readLine ());
        int sred=0;

        if ((n1 > n2 && n1 < n3) || (n1 < n2 && n1 > n3))
            sred = n1;
        if ((n2 > n3 && n2 < n1)|| (n2 < n3 && n2 > n1))
            sred = n2;
        if ((n3 > n2 && n3 < n1)|| (n3 < n2 && n3 > n1))
            sred = n3;
// если два числа равны
        if ((n1 == n2 && n2 != n3) || (n1 == n3 && n1 != n2))
            sred = n1;
        if (n2 == n3 && n2 != n1)
            sred = n2;
 // если три числа равны
        if (n1 == n2 && n2 == n3)
            sred = n1;
        System.out.println(sred);
    }
}
