package level8.lectore_11;

/*
Модернизация ПО
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;


public class Solution_10 {
    public static void main (String[] args) throws IOException {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        Map<String, String> map = new HashMap<> ();
        while (true) {
            String gorod = reader.readLine ();
            if (gorod.isEmpty ()) {
                break;
            }
            String family = reader.readLine ();
            map.put (gorod, family);
        }

        String gorodIn = reader.readLine ();

        if (!gorodIn.isEmpty ()) {
            for (Map.Entry<String, String> item : map.entrySet ()) {
                if (gorodIn.equals (item.getKey ()))
                    System.out.println (item.getValue ());
            }
        }
    }
}