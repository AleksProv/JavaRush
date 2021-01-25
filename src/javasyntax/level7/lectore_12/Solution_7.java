package javasyntax.level7.lectore_12;

/*
Меняем функциональность. Если в строке четно число букв - удвоить, иначе утроить.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution_7 {
    public static void main (String[] args) throws Exception {
        ArrayList<String> strings = new ArrayList<> ();
        while (true) {
            String string = readString ();
            if (string == null || string.isEmpty ()) break;
            strings.add (string);
        }

        ArrayList<String> resultStrings = new ArrayList<> ();
        for (int i = 0; i < strings.size (); i++) {
            if (strings.get (i).length () % 2 == 0) {
                resultStrings.add(strings.get (i).concat (" ").concat (strings.get (i)));
            } else {
                resultStrings.add(strings.get (i).concat (" ").concat (strings.get (i)).concat (" ").concat (strings.get (i)));
            }
        }

        for (int i = 0; i < resultStrings.size (); i++) {
            System.out.println (resultStrings.get (i));
        }
    }

    public static String readString () throws Exception {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        return reader.readLine ();
    }
}