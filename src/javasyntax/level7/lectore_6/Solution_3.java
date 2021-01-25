package javasyntax.level7.lectore_6;

/*
Выражаемся покороче.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution_3 {
    public static void main (String[] args) throws Exception {
        int minLength;
        ArrayList<String> list = new ArrayList<> ();
        for (int i = 0; i < 5; i++) {
            list.add (readString ());
        }
        minLength = list.get (0).length ();
        for (String arr : list) {
            if (arr.length () <= minLength) {
                minLength = arr.length ();
            }
        }
        for (String arr : list) {
            if (arr.length () == minLength) {
                System.out.println (arr);
            }
        }
    }

    public static String readString () throws Exception {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        return reader.readLine ();
    }
}