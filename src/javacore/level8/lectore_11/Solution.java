package javacore.level8.lectore_11;

import javacore.level7.lectore_10.crud.Person;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Шифровка
 * Придумать механизм шифровки/дешифровки.
 * Программа запускается с одним из следующих наборов параметров:
 * -e fileName fileOutputName
 * -d fileName fileOutputName
 * где: fileName - имя файла, который необходимо зашифровать/расшифровать.
 * fileOutputName - имя файла, куда необходимо записать результат шифрования
 */

public class Solution {
    public static void main(String[] args) throws IOException {
//        args = new String[]{"-e", "d:/data.txt", "d:/data1.txt"};
//        args = new String[]{"-d", "d:/data1.txt", "d:/data2.txt"};

        String metka = args[0];

        if (!(metka.equals("-e") || metka.equals("-d"))) {
            return;
        }
        try (FileInputStream inputStream = new FileInputStream(args[1]);
             FileOutputStream fileOutputStream = new FileOutputStream(args[2])) {
            if (metka.equals("-e")) {
                while (inputStream.available() > 0) {
                    fileOutputStream.write(inputStream.read() + 11);
                }
            } else {
                while (inputStream.available() > 0) {
                    fileOutputStream.write(inputStream.read() - 11);
                }
            }
        } catch (IOException e) {
        }
    }
}

//       вариант 1
//        switch (args[0]) {
//            case "-e":
//                addCipher(args);
//                break;
//            case "-d":
//                reCipher(args);
//                break;
//        }
//    }
//
//    public static void addCipher(String[] args) {
//        try (FileInputStream inputStream = new FileInputStream(args[1]);
//             FileOutputStream fileOutputStream = new FileOutputStream(args[2])) {
//            while (inputStream.available() > 0) {
//                int count = inputStream.read();
//                fileOutputStream.write(count + 1);
//            }
//        } catch (IOException e) {
//        }
//    }
//
//    public static void reCipher(String[] args) {
//        try (FileInputStream inputStream = new FileInputStream(args[1]);
//             FileOutputStream fileOutputStream = new FileOutputStream(args[2])) {
//            while (inputStream.available() > 0) {
//                int count = inputStream.read();
//                fileOutputStream.write(count - 1);
//            }
//        } catch (IOException e) {
//        }
//    }
