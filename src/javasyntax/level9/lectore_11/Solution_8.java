package javasyntax.level9.lectore_11;
/*
Десять котов
 */


import java.util.*;

public class Solution_8 {
    public static void main (String[] args) {
        Map<String, Cat> map = createMap ();
        Set<Cat> set = convertMapToSet (map);
        printCatSet (set);
    }

    public static Map<String, Cat> createMap () {
        HashMap<String, Cat> map = new HashMap<> ();
        map.put ("Кот_1", new Cat ("Кот1"));
        map.put ("Кот_2", new Cat ("Кот2"));
        map.put ("Кот_3", new Cat ("Кот3"));
        map.put ("Кот_4", new Cat ("Кот4"));
        map.put ("Кот_5", new Cat ("Кот5"));
        map.put ("Кот_6", new Cat ("Кот6"));
        map.put ("Кот_7", new Cat ("Кот7"));
        map.put ("Кот_8", new Cat ("Кот8"));
        map.put ("Кот_9", new Cat ("Кот9"));
        map.put ("Кот_10", new Cat ("Кот10"));
        return map;
    }

    public static Set<Cat> convertMapToSet (Map<String, Cat> map) {
        Set<Cat> set = new HashSet<> ();
        Iterator<Map.Entry<String, Cat>> iterator = map.entrySet ().iterator ();
        while (iterator.hasNext ()) {
            set.add (iterator.next ().getValue ());
        }
        return set;
    }

    public static void printCatSet (Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println (cat);
        }
    }


    public static class Cat {
        private String name;

        public Cat (String name) {
            this.name = name;
        }

        public String toString () {
            return "Cat " + this.name;
        }
    }
}
