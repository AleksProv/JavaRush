package javasyntax.level7.lectore_6;

/*
В начало списка.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution_4 {
    public static void main (String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<> ();
        for (int i = 0; i < 10; i++) {
            list.add (0, readString ());
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