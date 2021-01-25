package javasyntax.level7.lectore_9;

/*
Удваиваем слова.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution_5 {

    public static void main (String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<> ();
        for (int i = 0; i < 10; i++) {
            list.add (readString ());
        }
        ArrayList<String> result = doubleValues (list);
        for (String arr : result) {
            System.out.println (arr);
        }
    }

    public static ArrayList<String> doubleValues (ArrayList<String> list) {
        for (int i = 0; i < list.size (); i += 2) {
            list.add (i + 1, list.get (i));
        }
        return list;
    }

    public static String readString () throws Exception {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        return reader.readLine ();
    }
}