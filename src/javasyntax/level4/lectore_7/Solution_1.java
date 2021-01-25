package javasyntax.level4.lectore_7;

//описание введенного числа

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_1 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите целое число ");
        int t1 = Integer.parseInt(reader.readLine());
        String otvet;

        if (t1 > 0)
            otvet = (t1 % 2 == 0) ? "положительное четное число" : "положительное нечетное число";
        else if (t1 < 0)
            otvet = (t1 % 2 != 0) ? "отрицательное нечетное число" : "отрицательное четное число";
        else
            otvet = "ноль";

        System.out.println(otvet);
    }
}


