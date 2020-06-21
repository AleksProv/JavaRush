package jborn.s02;
/*
Вывести максимальное и минимальное значение осадков.
 */

import java.util.Random;

public class Task11 {
    public static void main (String[] args) {
        Random random = new Random ();
        StringBuilder max = new StringBuilder ();
        StringBuilder min = new StringBuilder ();
        int arrMax = 0;
        int arrMin = 0;
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt (30);
            System.out.print (arr[i] + " ");
            if (arr[i] > arrMax) {
                arrMax = arr[i];
            }
            if (arr[i] < arrMin) {
                arrMin = arr[i];
            }
        }
        System.out.println (" ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arrMax) {
                max.append (i + 1).append (" ");
            } else if (arr[i] == arrMin) {
                min.append (i + 1).append (" ");
            }
        }
        System.out.println ("Максимальное колличество осадков - " + arrMax + " " + "в день " + max);
        System.out.println ("Минимальное колличество осадков - " + arrMin + " " + "в день " + min);
    }
}