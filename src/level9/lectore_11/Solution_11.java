package level9.lectore_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Задача по алгоритмам I Java Syntax: 9 уровень, 11 лекция
 */
public class Solution_11 {
    public static void main (String[] args) throws IOException {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        ArrayList<String> list = new ArrayList<> ();
        while (true) {
            String s = reader.readLine ();
            if (s.isEmpty ()) {
                break;
            }
            list.add (s);
        }
        String[] array = list.toArray (new String[0]);
        sort (array);
        for (String x : array) {
            System.out.println (x);
        }
    }

    public static void sort (String[] array) {
        String[] arrayCopy = array.clone ();
        String[] arrayFin = new String [arrayCopy.length];

        ArrayList<Integer> arrayNum = new ArrayList<> ();
        ArrayList<String> arrayStr = new ArrayList<> ();

        for (int i = 0; i < array.length; i++) {
            if (isNumber (array[i])) {
                arrayNum.add (Integer.parseInt (array[i]));
            } else {
                arrayStr.add (array[i]);
            }
        }
        String[] array2 = arrayStr.toArray (new String[0]);
            String element;
            int indexToInsert;
            for (int index = 0; index < array2.length; index++) {
                element = array2[index];
                indexToInsert = index;
                while (indexToInsert > 0 && isGreaterThan(array2[indexToInsert - 1], element)) {
                    array2[indexToInsert] = array2[indexToInsert - 1];
                    indexToInsert--;
                    array2[indexToInsert] = element;
                }
            }

            Integer[] array3 = arrayNum.toArray (new Integer[0]);
            int element2;
            int indexToInsert2;
            for (int index = 0; index < array3.length; index++) {
                element2 = array3[index];
                indexToInsert2 = index;
                while (indexToInsert2 > 0 && array3[indexToInsert2 - 1] < element2) {
                    array3[indexToInsert2] = array3[indexToInsert2 - 1];
                    indexToInsert2--;
                    array3[indexToInsert2] = element2;
                }
            }

        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < arrayCopy.length ; i++) {
            if (isNumber (arrayCopy[i])){
                    arrayFin[i] = String.valueOf (array3[count2]);
                    count2++;
            } else {
                    arrayFin[i] = array2[count1];
                    count1++;
            }
        }

    System.arraycopy (arrayFin,0,array,0,arrayFin.length);

    }

    // Метод для сравнения строк: "а" больше чем "б"
    public static boolean isGreaterThan (String a, String b) {
        return a.compareTo (b) > 0;
    }

    // Переданная строка - это число?
    public static boolean isNumber (String s) {
        if (s.length () == 0) {
            return false;
        }

        char[] chars = s.toCharArray ();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') //строка содержит '-'
                    || (!Character.isDigit (c) && c != '-') // или не цифра и не начинается с '-'
                    || (chars.length == 1 && c == '-')) // или одиночный '-'
            {
                return false;
            }
        }
        return true;
    }
}