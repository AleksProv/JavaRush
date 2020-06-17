package jborn;
/*
Найти сумму 2^0 + 2^1 + 2^2 + ... + 2^N
 */

import java.util.Scanner;

public class Task14 {
    public static void main (String[] args) {
        int summa = 1;
        int stepen = 1;
        int n = requestNumber ();
        while (1 < n) {
            stepen *= 2;
            n--;
            summa += stepen;
        }
        System.out.println (summa);
    }

    static int requestNumber () {
        Scanner scanner = new Scanner (System.in);
        System.out.println ("Введите число");
        return scanner.nextInt ();
    }
}