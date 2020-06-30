package level7.lectore_9;

/*
Р или Л.
 */

import java.util.ArrayList;

public class Solution_4 {

    public static void main (String[] args) {
        ArrayList<String> strings = new ArrayList<> ();
        strings.add ("роза");
        strings.add ("лоза");
        strings.add ("лира");
        strings.add ("лак");
        strings.add ("лари");
        strings = fix (strings);

        for (String string : strings) {
            System.out.println (string);
        }
    }

    public static ArrayList<String> fix (ArrayList<String> strings) {
        for (int i = 0; i < strings.size (); i++) {
            if (strings.get (i).contains ("р") && strings.get (i).contains ("л"))
                continue;
            else if (strings.get (i).contains ("р")) {
                strings.remove (i);
                i--;
            } else if (strings.get (i).contains ("л")) {
                strings.add (i + 1, strings.get (i));
                i++;
            }
        }
        return strings;
    }
}