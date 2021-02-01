package javacore.level8.lectore_5;

import java.io.*;

/**
 * Разделение файла
 * Считать с консоли три имени файла: файл1, файл2, файл3.
 * Разделить файл1 по следующему критерию: Первую половину байт записать в файл2,
 * вторую половину байт записать в файл3. Если в файл1 количество байт нечетное,
 * то файл2 должен содержать бОльшую часть. Закрыть потоки.
 */

public class Solution_3 {  // d:/file1.txt
    public static void main(String[] args) throws IOException {
        //2
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputFile = reader.readLine();
        String outputFile1 = reader.readLine();
        String outputFile2 = reader.readLine();
        try (FileInputStream fileInputStream = new FileInputStream(inputFile);
             FileOutputStream fileOutputStream1 = new FileOutputStream(outputFile1);
             FileOutputStream fileOutputStream2 = new FileOutputStream(outputFile2)) {
            int countByte = (fileInputStream.available() + 1) / 2;
            int currentByte = 0;
            while (fileInputStream.available() > 0) {
                if (currentByte < countByte) {
                    fileOutputStream1.write(fileInputStream.read());
                    currentByte++;
                } else {
                    fileOutputStream2.write(fileInputStream.read());
                }
            }
        }

        //1
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String[] fileName = new String[3];
//        for (int i = 0; i < 3; i++) {
//            fileName[i] = reader.readLine();
//        }
//        try (FileInputStream fileInputStream = new FileInputStream(fileName[0]);
//             FileOutputStream fileOutputStream1 = new FileOutputStream(fileName[1]);
//             FileOutputStream fileOutputStream2 = new FileOutputStream(fileName[2])) {
//            int countByte;
//            if (fileInputStream.available() % 2 != 0) {
//                countByte = (fileInputStream.available() + 1) / 2;
//            } else {
//                countByte = fileInputStream.available() / 2;
//            }
//            if (fileInputStream.available() > 0) {
//                byte[] buffer = new byte[fileInputStream.available()];
//                int count = fileInputStream.read(buffer);
//                fileOutputStream1.write(buffer, 0, countByte);
//                fileOutputStream2.write(buffer, countByte, count - countByte);
//            }
//        }
    }
}
