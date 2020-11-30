package javacore.level5.lectore_12.factorial;

/*
Факториал
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(reader.readLine());
        reader.close();
        System.out.println(factorial(input));
    }

    private static String factorial(int n) {
        int result = 1;
        if (n >= 0) {
            for (int i = 1; i < n + 1; i++) {
                result = result * i;
            }
        } else {
            return "0";
        }
        return Integer.toString(result);
    }


}
