package level9.lectore_6;

/*
Исключение при работе с коллекциями Map
 */

import java.util.HashMap;

public class Solution_5 {
    public static void main(String[] args) {
        try {
            HashMap<String, String> map = new HashMap<>(null);
            map.put(null, null);
            map.remove(null);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException");
        }
    }
}