package level7.lectore_12;

/*
Это конец.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution_3 {

    public static void main (String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<> ();
        String n;
        while (true) {
            n = readString ();
            if (!n.equals ("end"))
                list.add (n);
            else
                break;
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