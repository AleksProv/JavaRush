package javacore.level8.lectore_11;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Объединение файлов
 * Считать с консоли 2 имени файла.
 * В начало первого файла записать содержимое второго файла так, чтобы получилось объединение файлов.
 * Закрыть потоки.
 */
public class Solution_8 {
    public static void main(String[] args) throws IOException { //d:/line1.txt
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputFile1 = reader.readLine();
        String inputFile2 = reader.readLine();
        try (FileInputStream fileInputStream1 = new FileInputStream(inputFile1);
             FileInputStream fileInputStream2 = new FileInputStream(inputFile2);
             ByteArrayOutputStream byteArrayOutStream = new ByteArrayOutputStream()) {

            while (fileInputStream2.available() > 0) {
                byteArrayOutStream.write(fileInputStream2.read());
            }
            while (fileInputStream1.available() > 0) {
                byteArrayOutStream.write(fileInputStream1.read());
            }
            try (FileOutputStream fileOutputStream = new FileOutputStream(inputFile1)) {
                byteArrayOutStream.writeTo(fileOutputStream);
            }
        }
    }
}
