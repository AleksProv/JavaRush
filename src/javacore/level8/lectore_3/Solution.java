package javacore.level8.lectore_3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * Максимальный байт
 * Ввести с консоли имя файла. Найти максимальный байт в файле, вывести его на экран.
 * Закрыть поток ввода-вывода.
 */

public class Solution {
    public static void main(String[] args) throws Exception {  // путь d:/file1.txt
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(reader.readLine());
        int streamByte;
        int maxByte = 0;
        while (fileInputStream.available() > 0) {
            streamByte = fileInputStream.read();
            if (streamByte > maxByte) {
                maxByte = streamByte;
            }
        }
        System.out.println(maxByte);
        fileInputStream.close();
        reader.close();
    }
}
