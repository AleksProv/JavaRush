package level7.lectore_9;

/*
Проверка на упорядоченность.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution_6 {

    public static void main (String[] args) throws Exception {
        int len = 0;
        ArrayList<String> list = new ArrayList<> ();
        for (int i = 0; i < 3; i++) {
            list.add (readString ());
        }
        for (int i = 0; i < list.size (); i++) {
            if (list.get (i).length () >= len)
                len = list.get (i).length ();
            else {
                System.out.println (i);
                break;
            }
        }
    }

    public static String readString () throws Exception {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        return reader.readLine ();
    }
}