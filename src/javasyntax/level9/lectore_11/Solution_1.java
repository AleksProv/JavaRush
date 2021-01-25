package javasyntax.level9.lectore_11;
/*
Деление на ноль
 */

public class Solution_1 {

    public static void main (String[] args) {
        try {
            divideByZero ();
        } catch (ArithmeticException e) {
           e.printStackTrace ();
        }
    }

    public static void divideByZero () {
        System.out.println (3/0);
    }
}
