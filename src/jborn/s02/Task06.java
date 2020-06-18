package jborn.s02;

/*
Площадь крурга и длина окружности по его радиусу.
 */

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        int radius = requestNumber();
        System.out.printf("Площадь круга %.2f\n", areaCircle(radius));
        System.out.printf("Длина окружности %.2f", circumference(radius));
    }

    public static double areaCircle(double radius) {
        return Math.PI * radius * radius;
    }

    public static double circumference(double radius) {
        return 2 * Math.PI * radius;
    }

    static int requestNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        return scanner.nextInt();
    }

}


