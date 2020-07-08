package level8.lectore_6;

/*
Время для 10 тысяч вставок
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution_3 {
    public static void main (String[] args) {
        System.out.println (getInsertTimeInMs (new ArrayList ()));
        System.out.println (getInsertTimeInMs (new LinkedList ()));
    }

    public static long getInsertTimeInMs (List list) {
        long start = System.currentTimeMillis ();
        insert10000 (list);
        long stop = System.currentTimeMillis ();
        return stop - start;
    }

    public static void insert10000 (List list) {
        for (int i = 0; i < 10000; i++) {
            list.add (0, new Object ());
        }
    }
}