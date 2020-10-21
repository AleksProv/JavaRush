package level10.lectore_11;

/*
Функциональности маловато
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Solution_7 {
    public static void main (String[] args) throws Exception {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        HashMap<String, Integer> result = new HashMap<> ();
        while (true) {
            String number = reader.readLine ();
            if (number.isEmpty ()) {
                break;
            }
            int id = Integer.parseInt (number);
            String name = reader.readLine ();
            result.put (name, id);
            }

        for (Map.Entry<String, Integer> pair : result.entrySet ()) {
            System.out.println (pair.getValue () + " " + pair.getKey ());
        }
    }
}