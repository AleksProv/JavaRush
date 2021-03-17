package javacore.level8.lectore_11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Поиск данных внутри файла
 * Считать с консоли имя файла.
 * Найти в файле информацию, которая относится к заданному id, и вывести ее на экран в виде,
 * в котором она записана в файле. Программа запускается с одним параметром: id (int).
 * Закрыть потоки.
 * В файле данные разделены пробелом и хранятся в следующей последовательности: id
 */

public class Solution_11 { // "d:/prod.txt"
    public static void main(String[] args) throws IOException {
//        args = new String[]{"11"};

// 2 вариант
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str;
        try (BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine()))) {
            while ((str = fileReader.readLine()) != null) {
                if (str.startsWith(args[0] + " ")) {
                    System.out.println(str);
                    break;
                }
            }
        }


//   1 вариант
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String inputFile = reader.readLine();
//        ArrayList<String> list = new ArrayList<>();
//        try (BufferedReader fileReader = new BufferedReader(new FileReader(inputFile))) {
//            String c;
//            while ((c = fileReader.readLine()) != null) {
//                list.add(c);
//            }
//        } catch (IOException e) {
//        }
//        for (String pear : list) {
//            String[] splitLine = pear.split(" ");
//            if (splitLine[0].equals(args[0])) {
//                System.out.println(pear);
//                break;
//            }
//        }
    }
}
