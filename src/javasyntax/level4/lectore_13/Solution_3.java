package javasyntax.level4.lectore_13;

//Вывести прямоугольный треугольник со сторонами 10 и 10 из восьмерок.

public class Solution_3 {
    public static void main (String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print (8);
            }
            System.out.println (" ");
        }
    }
}
