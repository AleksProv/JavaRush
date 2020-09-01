package level9.lectore_11;
/*
Обратный отсчет I Java Syntax: 9 уровень, 11 лекция
 */

public class Solution_2 {
    public static void main (String[] args) {
        for (int i = 10; i >= 0; i--) {
            System.out.println (i);
            try {
                Thread.sleep (100);
            } catch (InterruptedException e) {
                e.printStackTrace ();
            }
        }
    }
}