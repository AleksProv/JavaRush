package level4.lectore_10;

//вывести на экран таблицу умножения 10*10 используя while.

public class Solution_5 {
    public static void main (String[] args) {
        int i = 0;
        int j = 0;
        int namb;
        int mno = 0;
        while (i < 10) {
            i++;
            mno++;
            while (j < 10) {
                j++;
                namb = mno * j;
                System.out.print (namb + " ");
            }
            System.out.println (" ");
            j = 0;
        }
    }
}
