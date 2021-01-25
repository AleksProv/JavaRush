package javasyntax.level8.lectore_8;

/*
Нам повторы не нужны
 */

import java.util.*;

public class Solution_5 {
    public static Map<String, String> createMap () {
        Map<String, String> map = new HashMap<> ();
        map.put ("Ivanov1", "Ivan");
        map.put ("Ivanov2", "Ivan5");
        map.put ("Ivanov3", "Ivan");
        map.put ("Ivanov4", "Ivan3");
        map.put ("Ivanov5", "Ivan7");
        map.put ("Ivanov6", "Ivan5");
        map.put ("Ivanov7", "Ivan2");
        map.put ("Ivanov8", "Ivan3");
        map.put ("Ivanov9", "Ivan3");
        map.put ("Ivanov10", "Ivan3");
        return map;
    }


    public static void removeTheFirstNameDuplicates (Map<String, String> map) {
        System.out.println (map);
        List<String> list = new ArrayList<> ();
        for (Map.Entry<String, String> item : map.entrySet ()) {
            if (Collections.frequency (map.values (), item.getValue ()) > 1)
                list.add (item.getValue ());
        }
        for (String name : list) {
            removeItemFromMapByValue (map, name);
        }
        System.out.println (map);
    }


    public static void removeItemFromMapByValue (Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<> (map);
        for (Map.Entry<String, String> pair : copy.entrySet ()) {
            if (pair.getValue ().equals (value))
                map.remove (pair.getKey ());
        }
    }


    public static void main (String[] args) {
         removeTheFirstNameDuplicates (createMap ());
    }
}