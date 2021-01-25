package javasyntax.level10.lectore_11;

/*
Большая зарплата
 */

public class Solution_1 {
    public static void main (String[] args) {
        String s = "Я не хочу изучать Java, я хочу большую зарплату";
        for (int i = 0; i < 40; i++) {
            System.out.print (s.substring (i));
            System.out.println ();
        }
    }
}