package javasyntax.level5.lectore_12;

/*
Совершенствуем функциональность. Вывести минимум из 5 чисел.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_6 {
    public static void main (String[] args) throws Exception {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        int a = Integer.parseInt (reader.readLine ());
        int b = Integer.parseInt (reader.readLine ());
        int c = Integer.parseInt (reader.readLine ());
        int d = Integer.parseInt (reader.readLine ());
        int f = Integer.parseInt (reader.readLine ());
        int minimum = min (a, b, c, d, f);
        System.out.println ("Minimum = " + minimum);
    }

    public static int min (int a, int b, int c, int d, int f) {
        int miniMin;
        int[] minim = new int[] {a, b, c, d, f};
        miniMin = minim[0];
        for (int i = 0; i < 4; i++) {
            if (miniMin > minim[i+1])
                miniMin = minim[i+1];
        }
        return miniMin;
    }
}