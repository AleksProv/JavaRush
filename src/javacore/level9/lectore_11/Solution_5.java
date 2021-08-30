package javacore.level9.lectore_11;

import java.io.*;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

/**
 * Замена чисел
 * В статическом блоке инициализируйте словарь map парами [число-слово] от 0 до 12 включительно.
 * Считайте с консоли имя и содержимое файла.
 * Замените все числа на слова используя словарь map.
 * После этого выведите результат на экран и закройте потоки.
 */

public class Solution_5 {
    public static Map<Integer, String> map = new HashMap<>();

    static {
        map.put(0, "ноль");
        map.put(1, "один");
        map.put(2, "два");
        map.put(3, "три");
        map.put(4, "четыре");
        map.put(5, "пять");
        map.put(6, "шесть");
        map.put(7, "семь");
        map.put(8, "восемь");
        map.put(9, "девять");
        map.put(10, "десять");
        map.put(11, "одиннадцать");
        map.put(12, "двенадцать");
    }

    public static void main(String[] args) {  // d:/map.txt
        String fileName = null;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            fileName = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String line;
        try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName, Charset.forName("windows-1251")))) {
            while ((line = fileReader.readLine()) != null) {
                for (Map.Entry<Integer, String> pear : map.entrySet()) {
                    line = line.replaceAll("\\b" + pear.getKey() + "\\b", pear.getValue());
                }
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
