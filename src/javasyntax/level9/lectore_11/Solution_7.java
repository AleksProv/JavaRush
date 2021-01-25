package javasyntax.level9.lectore_11;
/*
Список из массивов чисел
 */

import java.util.ArrayList;

public class Solution_7 {
    public static void main (String[] args) {
        ArrayList<int[]> list = createList ();
        printList (list);
    }

    public static ArrayList<int[]> createList () {
            ArrayList<int[]> list = new ArrayList<> ();
            int[] mas1 = {1,2,3,4,5};
            int[] mas2 = {1,2};
            int[] mas3 = {1,2,3,4};
            int[] mas4 = {1,2,3,4,5,6,7};
            int[] mas5 = {};
            list.add (mas1);
            list.add (mas2);
            list.add (mas3);
            list.add (mas4);
            list.add (mas5);
        return list;
    }

    public static void printList (ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println (x);
            }
        }
    }
}
