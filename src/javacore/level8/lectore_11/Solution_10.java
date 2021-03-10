package javacore.level8.lectore_11;

import java.io.*;

/**
 * Встречаемость символов
 * Программа запускается с одним параметром - именем файла, который содержит английский текст.
 * Посчитать частоту встречания каждого символа. Отсортировать результат по возрастанию кода ASCII (почитать в инете).
 * Пример: ','=44, 's'=115, 't'=116. Вывести на консоль отсортированный результат: [символ1] чаcтота1
 */

public class Solution_10 {
    public static void main(String[] args) throws IOException {
//        args = new String[]{"d:/data.txt"};
        int[] aSCII = new int[128];
        try (FileReader fileReader = new FileReader(args[0])) {
            while (fileReader.ready()) {
                aSCII[fileReader.read()]++;
            }
            for (int i = 0; i < aSCII.length; i++) {
                if (aSCII[i] != 0) {
                    System.out.println((char) i + " " + aSCII[i]);
                }
            }
        }
    }
}
