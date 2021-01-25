package javasyntax.level4.lectore_10;

//вывести на экран таблицу умножения 10*10 используя while.

public class Solution_5 {
    public static void main (String[] args) {
        int i = 0;
        int j = 0;
        while (i < 10) {
            i++;
            while (j < 10) {
                j++;
                System.out.print (i * j + " ");
            }
            System.out.println (" ");
            j = 0;
        }
    }
}
