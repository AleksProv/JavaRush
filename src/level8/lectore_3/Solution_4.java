package level8.lectore_3;
/*
Вывести на экран список ключей
 */

import java.util.HashMap;
import java.util.Map;

public class Solution_4 {
    public static void main (String[] args) {
        Map<String, String> map = new HashMap<> ();
        map.put ("Sim", "Sim");
        map.put ("Tom", "Tom");
        map.put ("Arbus", "Arbus");
        map.put ("Baby", "Baby");
        map.put ("Cat", "Cat");
        map.put ("Dog", "Dog");
        map.put ("Eat", "Eat");
        map.put ("Food", "Food");
        map.put ("Gevey", "Gevey");
        map.put ("Hugs", "Hugs");
        printKeys (map);
    }

    public static void printKeys (Map<String, String> map) {
        for (String key : map.keySet ()) {
            System.out.println ("Key: " + key);
        }
    }
}