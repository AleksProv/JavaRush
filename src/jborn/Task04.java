package jborn;

/*
Найти расстояние между точками.
 */

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        int x1 = requestNumber();
        int x2 = requestNumber();
        int y1 = requestNumber();
        int y2 = requestNumber();
        double distan = getDistance(x1, x2, y1, y2);
        System.out.printf("Расстояние между точками %.2f", distan);

    }

    public static double getDistance(int x1, int x2, int y1, int y2) {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }

    static int requestNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        return scanner.nextInt();
    }

}


