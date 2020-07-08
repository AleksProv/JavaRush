package level8.lectore_3;
/*
Коллекция Map из Object
 */

import java.util.HashMap;
import java.util.Map;

public class Solution_6 {
    public static void main (String[] args) {
        Map<String, Object> map = new HashMap<> ();
        map.put ("Sim", 5);
        map.put ("Tom", 5.5);
        map.put ("Arbus", false);
        map.put ("Baby", null);
        map.put ("Cat", "Cat");
        map.put ("Eat", new Long (56));
        map.put ("Food", new Character ('3'));
        map.put ("Gevey", '6');
        map.put ("Hugs", 111111111111L);
        map.put ("Comp", (double) 123);
        map.forEach ((key, value) -> System.out.println (key + " - " + value));
    }
}