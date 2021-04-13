package javacore.level9.lectore_5;

import java.io.*;
import java.util.ArrayList;

/**
 * Считать с консоли 2 имени файла. Вывести во второй файл все числа, которые есть в первом файле.
 * Числа выводить через пробел.
 * Закрыть потоки.
 * Пример тела файла: 12 text var2 14 8v 1
 * Результат: 12 14 1
 */

public class Solution_3 {  //d:/005/file1.txt
    public static void main(String[] args) {
        ArrayList<String> fileContent = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine()))) {
            while (fileReader.ready()) {
                fileContent.add(fileReader.readLine());
            }
            try (BufferedWriter fileWriter = new BufferedWriter(new FileWriter(reader.readLine()))) {
                for (String line : fileContent) {
                    String[] lineArray = line.trim().split(" ");
                    for (String pear : lineArray) {
                        try {
                            int num = Integer.parseInt(pear);
                            fileWriter.write(pear + " ");
                        } catch (Exception ignore) {
                            /* NOP */
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

// 1 вариант
//                while (fileReader.ready()) {
//                    String line = fileReader.readLine();
//                    String[] lineArray = line.split(" ");
//                    for (String pear : lineArray) {
//                        if (pear.matches("-?\\d+(\\.\\d+)?"))
//                            fileWriter.write(pear + " ");
//                    }
//                }
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}