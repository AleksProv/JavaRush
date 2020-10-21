package level10.lectore_11;

/*
Поправочки нужны
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Solution_9 {
    HashMap<Integer, String> map;
    static Integer index;
    static String name;

    public Solution_9 () {
        this.map = new HashMap<> ();
    }

    public static void main (String[] args) throws IOException {
        Solution_9 solution9 = new Solution_9 ();
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));

        for (int i = 0; i < 10; i++) {
            int index = Integer.parseInt (reader.readLine ());
            String name = reader.readLine ();
            solution9.map.put (index, name);
        }

        for (Map.Entry<Integer,String> pair : solution9.map.entrySet ()){
            index = pair.getKey ();
            name = pair.getValue ();
            System.out.println ("Id=" + index + " Name=" + name);
        }
    }
}