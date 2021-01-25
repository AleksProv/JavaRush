package javasyntax.level7.lectore_6;

/*
Что за список такой?
 */

import java.util.ArrayList;

public class Solution {
    public static void main (String[] args) {
        ArrayList<String> list = new ArrayList<> ();
        list.add ("строка 1");
        list.add ("строка 2");
        list.add ("строка 3");
        list.add ("строка 4");
        list.add ("строка 5");
        System.out.println (list.size ());
        for (String arr : list) {
            System.out.println (arr);
        }
    }
}