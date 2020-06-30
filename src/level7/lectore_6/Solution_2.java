package level7.lectore_6;

/*
Самая длинная строка.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution_2 {
    private static ArrayList<String> strings;

    public static void main (String[] args) throws Exception {
        int maxLength = 0;
        strings = new ArrayList<> ();
        for (int i = 0; i < 5; i++) {
            strings.add (readString ());
        }
        for (String arr : strings) {
            if (arr.length () >= maxLength) {
                maxLength = arr.length ();
            }
        }
        for (String arr : strings) {
            if (arr.length () == maxLength) {
                System.out.println (arr);
            }
        }
    }

    public static String readString () throws Exception {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        return reader.readLine ();
    }
}