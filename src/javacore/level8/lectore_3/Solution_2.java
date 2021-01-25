package javacore.level8.lectore_3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * Минимальный байт
 * Ввести с консоли имя файла. Найти минимальный байт в файле, вывести его на экран.
 * Закрыть поток ввода-вывода.
 */

public class Solution_2 {
    public static void main(String[] args) throws Exception {  // путь d:/file1.txt
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(reader.readLine());
        int streamByte;
        int minByte = 255;
        while (fileInputStream.available() > 0) {
            streamByte = fileInputStream.read();
            if (streamByte < minByte) {
                minByte = streamByte;
            }
        }
        System.out.println(minByte);
        fileInputStream.close();
        reader.close();
    }
}
