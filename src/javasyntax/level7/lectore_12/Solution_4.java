package javasyntax.level7.lectore_12;

/*
Обратный отсчет.
 */

public class Solution_4 {

    public static void main (String[] args) throws Exception {
        for (int i = 30; i >=0 ; i--) {
            System.out.println (i);
            Thread.sleep (100);
        }
        System.out.println ("Бум!");
    }
}