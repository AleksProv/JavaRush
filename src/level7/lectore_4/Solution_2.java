package level7.lectore_4;
/*
Массив из строчек в обратном порядке
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Solution_2 {
    public static void main (String[] args) throws Exception {
        String[] array = new String[10];
        for (int i = 0; i < 8; i++) {
            array[i] = readString ();
        }
        for (int i = array.length-1; i >= 0; i--) {
            System.out.println (array[i]);
        }
    }


    public static String readString () throws Exception {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        return reader.readLine ();
    }

}