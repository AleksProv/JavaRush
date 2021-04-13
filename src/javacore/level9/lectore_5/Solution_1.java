package javacore.level9.lectore_5;

import java.io.*;

/**
 * Четные символы
 * Считать с консоли 2 имени файла.
 * Вывести во второй файл все символы с четным порядковым номером (нумерация начинается с 1).
 * Пример первого файла: text in file Вывод во втором файле: eti ie
 * Закрыть потоки ввода-вывода.
 */

public class Solution_1 {   //d:/003/file1.txt
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileReader fileReader = new FileReader(reader.readLine());
             FileWriter fileWriter = new FileWriter(reader.readLine())) {
            int count = 0;
            while (fileReader.ready()) {
                int data = fileReader.read();
                count++;
                if (count % 2 == 0) {
                    fileWriter.write(data);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
