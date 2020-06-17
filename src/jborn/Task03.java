package jborn;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        int n = requestNumber();
        if (n > 9 && n < 100) {
            int des = n / 10;
            int edin = n % 10;
            System.out.println("Колличество десятков " + des);
            System.out.println("Колличество единиц " + edin);
            System.out.println("Сумма цифр " + (des + edin));
            System.out.println("Произведение цифр " + des * edin);
        } else {
            System.out.println("Введите двухзначное число");
        }

    }

    static int requestNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        return scanner.nextInt();
    }

}


