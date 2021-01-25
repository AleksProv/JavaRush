package javasyntax.level7.lectore_6;

/*
Удалить и вставить.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution_5 {
    public static void main (String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<> ();
        for (int i = 0; i < 5; i++) {
            list.add (readString ());
        }

        for (int i = 0; i < 13; i++) {
            list.add (0, list.remove (list.size () - 1));
        }

        for (String arr : list) {
            System.out.println (arr);
        }
    }

    public static String readString () throws Exception {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        return reader.readLine ();
    }
}