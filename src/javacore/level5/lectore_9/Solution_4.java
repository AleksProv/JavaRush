package javacore.level5.lectore_9;

/*
Статики и исключения
 */

public class Solution_4 {
    public static int A = 0;


    static {
     if (true)
         throw new RuntimeException("");
    }

    public static int B = 5;

    public static void main(String[] args) {
        System.out.println(B);
    }
}
