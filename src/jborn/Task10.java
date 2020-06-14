package jborn;

/*
Найти сумму четных элементов массива и произведение нечетных.
 */

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        int n = requestNumber();
        int summ = 0;
        int composition = 1;
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = requestNumber();
        }

        for (int i = 0; i < arr.length; i++) {
            if (i == 0 | i % 2 == 0)
                summ += arr[i];
            else
                composition *= arr[i];
        }

        System.out.println("Сумма четных элементов массива " + summ);
        System.out.println("Произведение нечетных элементов массива " + composition);
    }

    static int requestNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        return scanner.nextInt();
    }

}


