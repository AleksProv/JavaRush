package level7.lectore_12;

/*
В убывающем порядке, с сортировкой массива.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_8 {
    public static void main (String[] args) throws Exception {
        int[] array = new int[5];
        for (int i = 0; i < 5; i++) {
            array[i] = Integer.parseInt (readString ());
        }
        sort (array);

        for (int x : array) {
            System.out.println (x);
        }
    }

    public static void sort (int[] array) {
        int element;
        int indexToInsert;
        for (int i = 0; i < array.length; i++) {
            element = array[i];
            indexToInsert = i;
            while (indexToInsert > 0 && array[indexToInsert - 1] < element) {
                array[indexToInsert] = array[indexToInsert - 1];
                indexToInsert--;
                array[indexToInsert] = element;
            }
        }
    }

    public static String readString () throws Exception {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        return reader.readLine ();
    }
}