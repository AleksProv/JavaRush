package javacore.level4.lectore_8.nod;
/*
НОД
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());

//3 вариант
        if (a > 0 && b > 0) {
            System.out.println(nod(a, b));
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static int nod(int i, int j) {
        return j != 0 ? nod(j, i % j) : i;
    }


// 2 вариант
//        int max = 0;
//        if (a < 1 || b < 1) throw new IllegalArgumentException();
//
//        for (int i = 1; i < Math.min(a, b); i++) {
//            if (a % i == 0 && b % i == 0) {
//                max = i;
//            }
//        }
//        System.out.println(max);
//    }

// 1 вариант
//            if (a <= 0 || b <= 0) throw new IllegalArgumentException();
//
//            while (a != b) {
//                if (a > b) {
//                    a = a - b;
//                } else {
//                    b = b - a;
//                }
//            }
//            System.out.println(a);
//    }
}