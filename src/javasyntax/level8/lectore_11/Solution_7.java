package javasyntax.level8.lectore_11;
/*
Пять победителей
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_7 {
    public static void main (String[] args) throws IOException {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt (reader.readLine ());
        }
        sort (array);
        System.out.println (array[0]);
        System.out.println (array[1]);
        System.out.println (array[2]);
        System.out.println (array[3]);
        System.out.println (array[4]);
    }


    public static void sort (int[] array) {
        int element;
        int indexToInsert;
        for (int index = 0; index < array.length; index++) {
            element = array[index];
            indexToInsert = index;
            while (indexToInsert > 0 && array[indexToInsert - 1] < element) {
                array[indexToInsert] = array[indexToInsert - 1];
                indexToInsert--;
                array[indexToInsert] = element;
            }
        }
    }
}