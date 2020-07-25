package level8.lectore_8;

/*
Перепись населения
 */

import java.util.HashMap;
import java.util.Map;

public class Solution_3 {
    public static Map<String, String> createMap () {
        Map<String, String> map = new HashMap<> ();
        map.put ("Petrov1", "Ivan");
        map.put ("Petrov2", "Ivan2");
        map.put ("Petrov3", "Ivan");
        map.put ("Petrov4", "Ivan");
        map.put ("Petrov5", "Ivan");
        map.put ("Petrov6", "Ivan3");
        map.put ("Petrov7", "Ivan");
        map.put ("Petrov8", "Ivan");
        map.put ("Petrov9", "Ivan4");
        map.put ("Petrov10", "Ivan");
        return map;
    }


    public static int getCountTheSameFirstName (Map<String, String> map, String name) {
        int count = 0;
        for (HashMap.Entry<String, String> item : map.entrySet ()) {
            if (item.getValue ().equals (name))
                count++;
        }
        return count;
    }

    public static int getCountTheSameLastName (Map<String, String> map, String lastName) {
        int count = 0;
        for (HashMap.Entry<String, String> item : map.entrySet ()) {
            if (item.getKey ().equals (lastName))
                count++;
        }
        return count;
    }

    public static void main (String[] args) {
        getCountTheSameFirstName (createMap (), "Ivan");
        getCountTheSameLastName (createMap (), "Petrov");
    }
}