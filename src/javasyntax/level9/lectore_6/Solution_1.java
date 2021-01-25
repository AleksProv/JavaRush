package javasyntax.level9.lectore_6;

/*
Исключение при работе с числами
 */

public class Solution_1 {
    public static void main(String[] args) {
        try {
            int a = 42 / 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: / by zero");
        }
    }
}