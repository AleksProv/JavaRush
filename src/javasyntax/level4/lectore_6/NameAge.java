package javasyntax.level4.lectore_6;

/*
 Ввести имя и возраст. Если возраст меньше 18 вывести "Подрасти еще"
 */

import java.io.InputStreamReader;
import java.io.BufferedReader;

public class NameAge {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите имя");
        String name = reader.readLine();
        System.out.println("Введите возраст");
        int age = Integer.parseInt(reader.readLine());
        if (age < 18)
            System.out.println("Подрасти еще");
    }
}
