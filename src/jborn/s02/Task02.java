package jborn.s02;

import java.util.Scanner;

public class Task02 {
    public static void main (String[] args) {
        int n = requestNumber ();
        int chas = n / 60 / 60;
        int minut = n / 60 % 60;
        int sekund = n % 60;
        System.out.println ("С начала суток прошло " + chas + " полных часа.");
        System.out.println ("С начала очередного часа прошло " + minut + " полных минут.");
        System.out.println ("С начала очередной минуты прошло " + sekund + " полных секунд.");
    }

    static int requestNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        return scanner.nextInt();
    }

}


