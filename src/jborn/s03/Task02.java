package jborn.s03;
/*
Вывести последовательность рандомных чисел из N количества.
 */
import java.util.Random;
import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        int n = requestNumber();
        Random random = new Random ();
        for (int i = 0; i < n; i++) {
            System.out.print(random.nextInt(10));
        }
    }

    static int requestNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        return scanner.nextInt();
    }
}