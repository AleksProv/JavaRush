package level4.lectore6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Вывести на экран номер координатной четверти
 */
public class Koordinat {
    public static void main(String[] args) throws Exception {
        int num = 0; // порядковый номер
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число 1");
        int t1 = Integer.parseInt(reader.readLine());
        System.out.println("Введите число 2");
        int t2 = Integer.parseInt(reader.readLine());
        if (t1 > 0 && t2 > 0)
            num = 1;
        else if (t1 < 0 && t2 > 0)
            num = 2;
        else if (t1 < 0 && t2 < 0)
            num = 3;
        else if (t1 > 0 && t2 < 0)
            num = 4;
        System.out.println("Номер координатной четверти - " + num);
    }
}
