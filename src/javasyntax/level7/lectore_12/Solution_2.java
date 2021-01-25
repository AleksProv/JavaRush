package javasyntax.level7.lectore_12;

/*
Минимаксы в массивах.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_2 {
    public static void main (String[] args) throws Exception {
        int maximum;
        int minimum;
        int[] array = getInts ();
        maximum = array[0];
        minimum = array[0];
        for (int element : array) {
            if (element >= maximum)
                maximum = element;
            else if (element <= minimum)
                minimum = element;
        }
        System.out.println (maximum + " " + minimum);
    }

    public static int[] getInts () throws Exception {
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt (readString ());
        }
        return array;
    }

    public static String readString () throws Exception {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        return reader.readLine ();
    }
}