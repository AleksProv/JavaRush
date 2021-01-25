package javasyntax.level7.lectore_4;
/*
Массивный максимум
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Solution {
    public static void main (String[] args) throws Exception {
        int[] array = initializeArray ();
        int max = max (array);
        System.out.println (max);
    }

    public static int[] initializeArray () throws Exception {
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = Integer.parseInt (readString ());
        }
        return array;
    }

    public static int max (int[] array) {
        int max = array[0];
        for (int elem : array) {
            if (elem >= max)
                max = elem;
        }
        return max;
    }

    public static String readString () throws Exception {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        return reader.readLine ();
    }

}