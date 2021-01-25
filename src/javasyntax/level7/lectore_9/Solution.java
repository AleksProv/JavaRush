package javasyntax.level7.lectore_9;

/*
Играем в Jолушку
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main (String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<> ();
        ArrayList<Integer> list1 = new ArrayList<> ();  //делится на 3
        ArrayList<Integer> list2 = new ArrayList<> ();    //делится на 2
        ArrayList<Integer> list3 = new ArrayList<> ();    //остальные
        for (int i = 0; i < 20; i++) {
            list.add (Integer.parseInt (readString ()));
        }
        for (int i = 0; i < list.size (); i++) {
            Integer x = list.get (i);
            if (x % 2 == 0)
                list2.add (x);
            else if (x % 3 == 0)
                list1.add (x);
            else
                list3.add (x);
            if (x % 2 == 0 && x % 3 == 0)
                list1.add (x);
        }
        if (!list1.isEmpty ())
            printList (list1);
        if (!list2.isEmpty ())
            printList (list2);
        if (!list3.isEmpty ())
            printList (list3);
    }

    public static void printList (ArrayList<Integer> list) {
        for (Integer arr: list ) {
            System.out.println (arr);
        }

    }

    public static String readString () throws Exception {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        return reader.readLine ();
    }
}
