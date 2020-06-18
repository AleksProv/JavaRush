package jborn.s02;

/*
Тройка Пифагора.
 */

import java.util.Scanner;

public class Task05 {
    public static void main (String[] args) {
        int a = requestNumber ();
        int b = requestNumber ();
        int c = requestNumber ();
        if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a)
            System.out.println ("тройка Пифагора");
        else
            System.out.println ("Нет");
    }

    static int requestNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        return scanner.nextInt();
    }

}


