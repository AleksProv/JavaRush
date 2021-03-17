package javacore.level8.lectore_11;

import java.io.*;
import java.util.Set;
import java.util.TreeSet;

/**
 * Собираем файл
 * Собираем файл из кусочков. Считывать с консоли имена файлов.
 * Каждый файл имеет имя: [someName].partN. Например, Lion.avi.part1, Lion.avi.part2, ..., Lion.avi.part37.
 * Имена файлов подаются в произвольном порядке. Ввод заканчивается словом "end".
 * В папке, где находятся все прочтенные файлы, создать файл без суффикса [.partN]
 * В него переписать все байты из файлов-частей используя буфер.
 * Переписать в строгой последовательности первый, второй, третий...
 */

public class Solution_14 {  //"d:/Num.txt.part1.txt"
    public static void main(String[] args) throws IOException {
        Set<String> set = new TreeSet<>();
        String line, outputFile = null;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (!(line = reader.readLine()).equals("end")) {
            set.add(line);
            if (outputFile == null) {
                outputFile = line.substring(0, line.lastIndexOf(".part"));
            }

        }
        reader.close();

        if (outputFile == null) {
            return;
        }
        try (FileOutputStream fileOutputStream = new FileOutputStream(outputFile)) {
            for (String pear : set) {
                try (FileInputStream fileInputStream = new FileInputStream(pear)) {
                    byte[] buffer = new byte[fileInputStream.available()];
                    while (fileInputStream.available() > 0) {
                        int bytesRead = fileInputStream.read(buffer);
                        fileOutputStream.write(buffer, 0, bytesRead);
                    }
                }
            }
        }
    }
}
