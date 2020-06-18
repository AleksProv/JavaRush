package jborn.s02;

/*
Таблица умножения на число N.
 */

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        int n = requestNumber();
        for (int i = 1; i <= 10; i++) {
            System.out.print(i * n + " ");
        }

    }

    static int requestNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        return scanner.nextInt();
    }

}


