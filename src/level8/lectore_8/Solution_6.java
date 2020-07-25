package level8.lectore_8;

/*
Только для богачей
 */


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution_6 {
    public static Map<String, Integer> createMap () {
        Map<String, Integer> map = new HashMap<> ();
        map.put ("Ivanov1", 100);
        map.put ("Ivanov2", 300);
        map.put ("Ivanov3", 500);
        map.put ("Ivanov4", 150);
        map.put ("Ivanov5", 100);
        map.put ("Ivanov6", 500);
        map.put ("Ivanov7", 700);
        map.put ("Ivanov8", 500);
        map.put ("Ivanov9", 600);
        map.put ("Ivanov10", 200);
        return map;
    }

    public static void removeItemFromMap (Map<String, Integer> map) {
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet ().iterator ();
        while (iterator.hasNext ()) {
            Map.Entry<String, Integer> item = iterator.next ();
            if (item.getValue () < 500)
                iterator.remove ();
        }

//        map.entrySet ().removeIf (item -> item.getValue () >= 500);
//        map.forEach ((key, value1) -> {
//            System.out.println (key + " == " + value1);
//        });
    }

    public static void main (String[] args) {
        removeItemFromMap (createMap ());
    }
}