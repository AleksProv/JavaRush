package javacore.level5.lectore_12.metod;

/*
разные методы для разных типов
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        while (true) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String pole = reader.readLine();
            if (!pole.equals("exit")) {
                try {
                    if (pole.contains(".")) {
                        double number = Double.parseDouble(pole);
                        print(number);
                    } else {
                        int number = Integer.parseInt(pole);
                        if (number > 0 && number < 128) {
                            print((short) number);
                        } else {
                            print(number);
                        }
                    }
                } catch (Exception e) {
                    print(pole);
                }
            } else {
                reader.close();
                break;
            }
        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}