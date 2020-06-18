package jborn.s02;

/*
Перевод см в полные метры.
 */

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        int n = requestNumber();
        System.out.println(n + " сантиметров - это " + n / 100 + " полных метра.");
    }

    static int requestNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        return scanner.nextInt();
    }

}

