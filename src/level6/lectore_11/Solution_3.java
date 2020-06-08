package level6.lectore_11;

/*
Числа по возрастанию.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_3 {
    public static void main (String[] args) throws Exception {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        int a = Integer.parseInt (reader.readLine ());
        int b = Integer.parseInt (reader.readLine ());
        int c = Integer.parseInt (reader.readLine ());
        int d = Integer.parseInt (reader.readLine ());
        int f = Integer.parseInt (reader.readLine ());
        int[] array = new int[]{a, b, c, d, f};
        int element;
        int indexToInsert;
        for (int index = 0; index < array.length; index++) {
            element = array[index];
            indexToInsert = index;
            while (indexToInsert > 0 && array[indexToInsert - 1] > element) {
                array[indexToInsert] = array[indexToInsert - 1];
                indexToInsert--;
                array[indexToInsert] = element;
            }
        }
        for (int arr : array) {
            System.out.println (arr);
        }
    }
}