package level10.lectore_4;

/*
Задача №1 на преобразование типов. Получить Д больше 0
 */
public class Solution_1 {
    public static void main (String[] args) {
        int a = 0;
        int b = (byte) (a + 46);
        byte c = (byte) (a * b);
        double f = (char) 1234.15;
        long d = (int) (a + f / c + b);
        System.out.println ("d = " + d);
    }
}
