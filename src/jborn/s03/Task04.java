package jborn.s03;
/*
Вывести пустой прямоугольник.
 */

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        int a = requestNumber();
        int b = requestNumber();
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                if ((i == 0) || (i == b - 1) || (j == 0) || (j == a - 1))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    static int requestNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        return scanner.nextInt();
    }
}