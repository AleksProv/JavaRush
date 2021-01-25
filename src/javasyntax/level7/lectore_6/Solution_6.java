package javasyntax.level7.lectore_6;

/*
Самые-самые.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution_6 {
    public static void main (String[] args) throws Exception {
        int maxLength = 0;
        int minLength;
        ArrayList<String> list = new ArrayList<> ();
        for (int i = 0; i < 10; i++) {
            list.add (readString ());
        }
        minLength = list.get (0).length ();
        for (String arr : list) {
            if (arr.length () < minLength) {
                minLength = arr.length ();
            } else if (arr.length () > maxLength) {
                maxLength = arr.length ();
            }
        }
        for (String arr : list) {
            if (arr.length () == minLength) {
                System.out.println (arr);
                break;
            } else if (arr.length () == maxLength) {
                System.out.println (arr);
                break;
            }
        }
    }

    public static String readString () throws Exception {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        return reader.readLine ();
    }
}