package level7.lectore_4;
/*
Один большой массив и два маленьких
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Solution_5 {
    public static void main (String[] args) throws Exception {
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = Integer.parseInt (readString ());
        }
        int[] array2 = new int[10];
        for (int i = 0; i < 10; i++) {
            array2[i] = array[i];
        }
        int[] array3 = new int[10];
        for (int i = 0; i < 10; i++) {
            array3[i] = array[i+10];
        }
        for (int elem : array3) {
            System.out.println (elem);
        }

    }


    public static String readString () throws Exception {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        return reader.readLine ();
    }

}