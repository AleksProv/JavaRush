package javacore.level8.lectore_5;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Подсчет запятых
 * С консоли считать имя файла. Посчитать в файле количество символов ',',
 * количество вывести на консоль. Закрыть потоки. Подсказка: нужно сравнивать с ascii-кодом символа ',' (44).
 */

public class Solution_2 {
    public static void main(String[] args) throws IOException {  // d:/data.txt
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        int count = 0;
        try (FileInputStream fileInputStream = new FileInputStream(fileName)) {
            while (fileInputStream.available() > 0) {
                if (fileInputStream.read() == 44) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
