package level7.lectore_12;

/*
Вывести числа в обратном порядке.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main (String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<> ();
        for (int i = 0; i < 10; i++) {
        list.add (Integer.parseInt (readString ()));
        }
        for (int i = list.size ()-1; i >= 0 ; i--) {
            System.out.println (list.get (i));
        }
    }

    public static String readString () throws Exception {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        return reader.readLine ();
    }
}