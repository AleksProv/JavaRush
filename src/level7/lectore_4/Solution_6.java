package level7.lectore_4;
/*
Улицы и дома.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Solution_6 {
    public static void main (String[] args) throws Exception {
        int summChet = 0;
        int summNechet = 0;
        int[] array = new int[15];
        for (int i = 0; i < 15; i++) {
            array[i] = Integer.parseInt (readString ());
        }

        for (int i = 0; i < 15; i++) {
            if (i % 2 == 0)
                summChet = summChet + array[i];
            else
                summNechet = summNechet + array[i];
        }
        if (summChet > summNechet)
            System.out.println ("В домах с четными номерами проживает больше жителей.");
        else
            System.out.println ("В домах с нечетными номерами проживает больше жителей.");

    }


    public static String readString () throws Exception {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        return reader.readLine ();
    }

}