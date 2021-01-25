package javasyntax.level9.lectore_6;

/*
Исключение при работе с при работе с числами
 */

public class Solution_6 {
    public static void main(String[] args) {
        try {
            int num = Integer.parseInt("XYZ");
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException");
        }
    }
}