package jborn;
/*
Среднее арифметическое значение массива.
 */
public class Task13 {
    public static void main (String[] args) {
        int summ = 0;
        int[] arr = {2, 3, 5, 8, 9};
        for (int value : arr) {
            summ += value;
        }
        double sredZnach = (double) summ / arr.length;
        System.out.println ("Среднее арифметическое значение массива - " + sredZnach);
    }
}