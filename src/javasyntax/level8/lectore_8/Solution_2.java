package javasyntax.level8.lectore_8;
/*
Больше 10? Вы нам не подходите
 */

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Solution_2 {
    public static Set<Integer> createSet () {
        Set<Integer> set = new HashSet<> ();
        for (int i = 0; i < 20; i++) {
            set.add (i);
        }
        return set;
    }

    public static Set<Integer> removeAllNumbersGreaterThan10 (Set<Integer> set) {
        Iterator<Integer> iterator = set.iterator ();
        while (iterator.hasNext ()) {
            int numb = iterator.next ();
            if (numb > 10)
                iterator.remove ();
        }
        return set;
    }

    public static void main (String[] args) {
        removeAllNumbersGreaterThan10 (createSet ());
    }
}