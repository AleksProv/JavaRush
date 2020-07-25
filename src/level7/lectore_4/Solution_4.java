package level7.lectore_4;
/*
Переверни массив
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Solution_4 {
    public static void main (String[] args) throws Exception {
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = Integer.parseInt (readString ());
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