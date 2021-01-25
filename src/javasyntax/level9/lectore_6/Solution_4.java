package javasyntax.level9.lectore_6;

/*
Исключение при работе с коллекциями List
 */

import java.util.ArrayList;

public class Solution_4 {
    public static void main(String[] args) {
        try {
            ArrayList<String> list = new ArrayList<>();
            String s = list.get(18);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBoundsException");
        }
    }
}