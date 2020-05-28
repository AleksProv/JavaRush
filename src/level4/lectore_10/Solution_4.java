package level4.lectore_10;

//вывести на экран квадрат из 10*10 букв S используя while.

public class Solution_4 {
    public static void main (String[] args) {
        int i = 0;
        int j = 0;
        while (i < 10) {
            i++;
            while (j < 10) {
                j++;
                System.out.print ("S");
            }
            System.out.println (" ");
            j = 0;
        }
    }
}
