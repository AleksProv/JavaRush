package jborn.s02;
/*
Расход денег на топливо для автомобиля/
 */

import java.util.Scanner;

public class Task12 {
    public static void main (String[] args) {
        System.out.println ("Введите расстояние пути в км.");
        double put = requestNumber ();
        System.out.println ("Введите средний расход топлива на 100 км");
        double rasxod = requestNumber ();
        System.out.println ("Введите стоимость одного литра топлива");
        double cost = requestNumber ();
        double result1 = put * rasxod / 100;
        double result2 = result1 * cost;
        System.out.printf ("Расход топлива на поездку - %.2f", result1);
        System.out.print (" литра.\n");
        System.out.printf ("Сумма денег на поездку составит - %.2f", result2);
        System.out.print (" рубля.");
    }

    static double requestNumber () {
        Scanner scanner = new Scanner (System.in);
        return scanner.nextDouble ();
    }

}