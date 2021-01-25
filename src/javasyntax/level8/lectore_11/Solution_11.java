package javasyntax.level8.lectore_11;

/*
Задача по алгоритмам I Java Syntax 8 уровень, 11 лекция. Алфавитный порядок слов
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_11 {
    public static void main (String[] args) throws IOException {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        String[] array = new String[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = reader.readLine ();
        }
        sort(array);
        for (String word : array) {
            System.out.println (word);
        }
    }

    public static void sort(String[] array){
        String element;
        int indexToInsert;
        for (int index = 0; index < array.length; index++) {
            element = array[index];
            indexToInsert = index;
            while (indexToInsert > 0 && isGreaterThan(array[indexToInsert - 1], element)) {
                array[indexToInsert] = array[indexToInsert - 1];
                indexToInsert--;
                array[indexToInsert] = element;
            }
        }
    }

    public static boolean isGreaterThan(String a, String b){
        return a.compareTo (b) > 0;
    }
}