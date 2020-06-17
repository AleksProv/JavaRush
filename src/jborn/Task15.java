package jborn;
/*
С клавиатуры вводятся натуральные числа X и Y. Вычислить произведение x y, используя лишь операцию сложения.
 */

import java.util.Scanner;

public class Task15 {
    public static void main (String[] args) {
        int summa = 0;
        int x = requestNumber ();
        int y = requestNumber ();
        int i = 0;
        while (i < y) {
            summa += x;
            i++;
        }
        System.out.println ("Произведение чисел - " + summa);
    }

    static int requestNumber () {
        Scanner scanner = new Scanner (System.in);
        System.out.println ("Введите число");
        return scanner.nextInt ();
    }
}