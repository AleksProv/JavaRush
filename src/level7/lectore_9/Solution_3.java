package level7.lectore_9;

/*
Продолжаем мыть раму.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution_3 {

    public static void main (String[] args) {
        String str = "именно";
        ArrayList<String> list = new ArrayList<> ();
        list.add ("мама");
        list.add ("мыла");
        list.add ("раму");
        for (int i = 1; i < list.size () + 1; i += 2) {
            list.add (i, str);
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