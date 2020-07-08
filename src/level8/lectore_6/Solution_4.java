package level8.lectore_6;

/*
Время для 10 вызовов get
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution_4 {
    public static void main (String[] args) {
        System.out.println (getGetTimeInMs (fill (new ArrayList ())));
        System.out.println (getGetTimeInMs (fill (new LinkedList ())));
    }

    public static List fill (List list) {
        for (int i = 0; i < 10000; i++) {
            list.add (new Object ());
        }
        return list;
    }

    public static long getGetTimeInMs (List list) {
        long start = System.currentTimeMillis ();
        get10000 (list);
        long stop = System.currentTimeMillis ();
        return stop - start;
    }

    public static void get10000 (List list) {
        if (list.isEmpty ()) {
            return;
        }
        int x = list.size () / 2;
        for (int i = 0; i < 10000; i++) {
            list.get (x);
        }
    }
}