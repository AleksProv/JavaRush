package javacore.level5.lectore_4;

/*
ООП - перегрузка
 */

public class Solution {
    public static void main(String[] args) {
        printMatrix(2,3,"8");
    }

    public static void printMatrix(int m, int n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(value);
            }
            System.out.println();
        }
    }

    public static void printMatrix(int m) {
        System.out.println("m");
    }

    public static void printMatrix(int m, int n) {
        System.out.println("m,n");
    }

    public static void printMatrix(int m, int n, int value) {
    }

    public static void printMatrix(int m, int n, int value, String value2) {
    }

    public static void printMatrix(int m, int n, int value, double wer) {
    }

    public static void printMatrix(double wer) {
    }

    public static void printMatrix(int m,  double wer) {
    }

    public static void printMatrix(int m, int n, int value, double wer, String value2) {
    }
}