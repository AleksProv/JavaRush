package level7.lectore_4;
/*
Общение одиноких массивов
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Solution_3 {
    public static void main (String[] args) throws Exception {
        String[] array = new String[10];
        int[] arrayInt = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = readString ();
        }
        for (int i = 0; i < 10; i++) {
            arrayInt[i] = array[i].length ();
        }
        for (int elem : arrayInt) {
            System.out.println (elem);
        }
    }


    public static String readString () throws Exception {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        return reader.readLine ();
    }

}