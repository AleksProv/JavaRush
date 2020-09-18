package level9.lectore_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import static level9.lectore_11.Solution_11.isNumber;

/*
Задача по алгоритмам I Java Syntax: 9 уровень, 11 лекция      Вариант 2 - лучший!!!!
 */
public class Solution_12 {
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
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (isNumber (array[i]) && isNumber (array[j])) {
                    if (isGreaterThan (array[i], array[j])) {
                        String temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                } else if (!(isNumber (array[i])) && !(isNumber (array[j]))) {
                    if (!isGreaterThan (array[i], array[j])) {
                        String temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }
        }
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