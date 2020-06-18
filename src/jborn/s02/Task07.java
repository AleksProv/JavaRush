package jborn.s02;

/*
Рассчитать значение Y при заданном значении X.
 */

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        int x = requestNumber();
        double y;
        if (x > 0)
            y = Math.sin(x) * Math.sin(x);
        else
            y = 1 - 2 * Math.sin(x * x);
        System.out.println(y);
    }

    static int requestNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        return scanner.nextInt();
    }

}

