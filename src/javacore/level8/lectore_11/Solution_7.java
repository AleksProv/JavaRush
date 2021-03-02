package javacore.level8.lectore_11;

import java.io.*;

/**
 * Два в одном
 * Считать с консоли 3 имени файла. Записать в первый файл содержимого второго файла,
 * а потом дописать в первый файл содержимое третьего файла.
 * Закрыть потоки.
 */

public class Solution_7 {
    public static void main(String[] args) throws IOException { //d:/line1.txt
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputFile1 = reader.readLine();
        String inputFile2 = reader.readLine();
        String inputFile3 = reader.readLine();
        try (FileOutputStream fileOutputStream = new FileOutputStream(inputFile1);
             FileInputStream fileInputStream1 = new FileInputStream(inputFile2);
             FileInputStream fileInputStream2 = new FileInputStream(inputFile3)) {
            while (fileInputStream1.available() > 0) {
                    fileOutputStream.write(fileInputStream1.read());
            }
            while (fileInputStream2.available() > 0) {
                fileOutputStream.write(fileInputStream2.read());
            }
        }
    }
}
