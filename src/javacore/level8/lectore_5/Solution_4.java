package javacore.level8.lectore_5;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Реверс файла
 * Считать с консоли 2 имени файла: файл1, файл2.
 * Записать в файл2 все байты из файл1, но в обратном порядке.
 * Закрыть потоки.
 */

public class Solution_4 {  // d:/file1.txt
    public static void main(String[] args) throws IOException {
//2
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputFile = reader.readLine();
        String outputFile = reader.readLine();
        try (FileInputStream fileInputStream = new FileInputStream(inputFile);
             FileOutputStream fileOutputStream = new FileOutputStream(outputFile)) {

            List<Integer> inputByte = new ArrayList<>();
            while (fileInputStream.available() > 0) {
                inputByte.add(fileInputStream.read());
            }

            Collections.reverse(inputByte);
            for (Integer newByte : inputByte) {
                fileOutputStream.write(newByte);
            }
        }
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String[] fileName = new String[2];
//        for (int i = 0; i < 2; i++) {
//            fileName[i] = reader.readLine();
//        }
//        try (FileInputStream fileInputStream = new FileInputStream(fileName[0]);
//             FileOutputStream fileOutputStream = new FileOutputStream(fileName[1])) {
//            if (fileInputStream.available() > 0) {
//                byte[] buffer = new byte[fileInputStream.available()];
//                fileInputStream.read(buffer);
//                for (int i = buffer.length - 1; i >= 0; i--) {
//                    fileOutputStream.write(buffer[i]);
//                }
//            }
//        }
    }
}
