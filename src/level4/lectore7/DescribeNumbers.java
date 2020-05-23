package level4.lectore7;
/*
  Вывести описание числа от 1 до 999 . Есть проще решение. Смотри вариант 2
 */

import java.io.InputStreamReader;
import java.io.BufferedReader;

public class DescribeNumbers {
    public static void main(String[] args) throws Exception {
        String number = "";
        String nuOneChet = "четное однозначное число";
        String nuOneNeChet = "нечетное однозначное число";
        String nuTwoChet = "четное двузначное число";
        String nuTwoNeChet = "нечетное двузначное число";
        String nuThreeChet = "четное трехзначное число";
        String nuThreeNeChet = "нечетное трехзначное число";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число ");
        int t1 = Integer.parseInt(reader.readLine());

        if (t1 > 0 && t1 < 1000) {
            if (Chet(t1) && Number1(t1) == 1)
                number = nuOneChet;
            else if (!Chet(t1) && Number1(t1) == 1)
                number = nuOneNeChet;
            else if (Chet(t1) && Number1(t1) == 2)
                number = nuTwoChet;
            else if (!Chet(t1) && Number1(t1) == 2)
                number = nuTwoNeChet;
            else if (Chet(t1) && Number1(t1) == 3)
                number = nuThreeChet;
            else if (!Chet(t1) && Number1(t1) == 3)
                number = nuThreeNeChet;
            System.out.println(number);
        }
    }

    // получение колличества знаков в числе 1 вариант
    public static int Number1(int t2) {
        int length = 0;
        int temp = 1;
        while (temp <= t2) {
            length++;
            temp *= 10;
        }
        return length;
    }

    // определяем четное или нечетное число
    public static boolean Chet(int t2) {
        return t2 % 2 == 0;
    }
}

