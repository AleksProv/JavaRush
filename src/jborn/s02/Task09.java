package jborn.s02;

/*
Найти сумму цифр числа N.
 */

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        int n = requestNumber();
        int sum = 0;
        while (n != 0) {
            sum += (n % 10);
            n /= 10;
        }
        System.out.println("Сумма цифр равна " + sum);

    }

    static int requestNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        return scanner.nextInt();
    }

}


