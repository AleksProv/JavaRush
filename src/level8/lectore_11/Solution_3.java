package level8.lectore_11;
/*
Однофамильцы и тезки
 */

import java.util.HashMap;
import java.util.Map;

public class Solution_3 {
    public static void main (String[] args) {
        Map<String, String> map = createPeopleMap ();
        printPeopleMap (map);
    }

    public static Map<String, String> createPeopleMap () {
        Map<String,String> map = new HashMap<> ();
        map.put ("Ivanov1","Ivan");
        map.put ("Ivanov2","Ivan2");
        map.put ("Ivanov3","Ivan2");
        map.put ("Ivanov4","Ivan");
        map.put ("Ivanov5","Ivan");
        map.put ("Ivanov6","Ivan");
        map.put ("Ivanov7","Ivan");
        map.put ("Ivanov8","Ivan");
        map.put ("Ivanov9","Ivan");
        map.put ("Ivanov1","Ivan");
        return map;
    }

    public static void printPeopleMap (Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet ()) {
            System.out.println (s.getKey () + " " + s.getValue ());
        }
    }
}
