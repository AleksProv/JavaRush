package javasyntax.level7.lectore_12;

/*
Перестановочка подоспела.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution_1 {

    public static void main (String[] args) throws Exception {
        int N = Integer.parseInt (readString ());
        int M = Integer.parseInt (readString ());
        String pole;
        ArrayList<String> list = new ArrayList<> ();
        for (int i = 0; i < N; i++) {
            list.add (readString ());
        }
        for (int i = 0; i < list.size (); i++) {
            while (M > 0) {
                pole = list.get (i);
                list.remove (i);
                list.add (pole);
                M--;
            }
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