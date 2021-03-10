package javacore.level8.lectore_11;

import java.io.*;
import java.util.ArrayList;

/**
 * Округление чисел
 * Считать с консоли 2 имени файла.
 * Первый файл содержит вещественные(дробные) числа, разделенные пробелом.
 * Например, 3.1415.
 * Округлить числа до целых и записать через пробел во второй файл.
 * Закрыть потоки.
 * Принцип округления: 3.49 => 3 3.50 => 4 3.51 => 4 -3.49 => -3 -3.50 => -3 -3.51 => -4
 */

public class Solution_9 {
    public static void main(String[] args) throws IOException { // d:/file1.txt
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputFile1 = reader.readLine();
        String inputFile2 = reader.readLine();
        try (BufferedReader fileReader = new BufferedReader(new FileReader(inputFile1));
             PrintWriter printWriter = new PrintWriter(inputFile2)) {
            while (fileReader.ready()) {
                String[] splitLine = fileReader.readLine().split(" ");
                for (String numberInt : splitLine) {
                    double number = Double.parseDouble(numberInt);
                    long roundNumber = Math.round(number);
                    printWriter.print(roundNumber + " ");
                }
            }

        }
    }

// 1 вариант
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String inputFile1 = reader.readLine();
//        String inputFile2 = reader.readLine();
//        ArrayList<Integer> list = new ArrayList<>();
//        try (BufferedReader fileReader = new BufferedReader(new FileReader(inputFile1));
//             FileWriter writer = new FileWriter(inputFile2)) {
//            String c;
//            while ((c = fileReader.readLine()) != null) {
//                String[] number = c.split(" ");
//                for (String pear : number) {
//                    list.add((int) Math.round(Double.parseDouble(pear)));
//                }
//            }
//
//            for (Integer numb : list) {
//                writer.write(Integer.toString(numb));
//                writer.write(" ");
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
}
