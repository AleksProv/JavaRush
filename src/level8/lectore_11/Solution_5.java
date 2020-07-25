package level8.lectore_11;
/*
Омовение Рамы
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Solution_5 {
    public static void main (String[] args) throws IOException {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        String string = reader.readLine ();
        string = string.trim ();
        for (String elem : string.split (" ")) {
            if (!elem.equals (""))
            System.out.print (elem.substring (0, 1).toUpperCase () + elem.substring (1) + " ");
        }
    }
}
