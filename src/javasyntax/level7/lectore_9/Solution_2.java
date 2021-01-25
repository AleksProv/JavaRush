package javasyntax.level7.lectore_9;

/*
Слова в обратном порядке.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution_2 {

    public static void main (String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<> ();
        for (int i = 0; i < 5; i++) {
            list.add (readString ());
        }
        list.remove (2);
        for (int i = list.size () - 1; i >= 0; i--) {
            System.out.println (list.get (i));
        }
    }

    public static String readString () throws Exception {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        return reader.readLine ();
    }
}