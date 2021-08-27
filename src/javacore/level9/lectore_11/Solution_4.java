package javacore.level9.lectore_11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * Самый богатый
 * В метод main первым параметром приходит имя файла.
 * В этом файле каждая строка имеет следующий вид:
 * имя значение где [имя] — String, [значение] — double. [имя] и [значение] разделены пробелом.
 * Для каждого имени посчитать сумму всех его значений.
 * Вывести в консоль имена в алфавитном порядке, у которых максимальная сумма.
 */

public class Solution_4 {
    public static void main(String[] args) {
        args = new String[]{"d:/zap2.txt"};
        String fileName = args[0];
        TreeMap<String, Double> map = new TreeMap<>();

        try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName))) {
            while (fileReader.ready()) {
                String[] array = fileReader.readLine().split(" ");
                String name = array[0];
                Double price = Double.parseDouble(array[1]);
                if (map.containsKey(name)) {
                    map.put(name, map.get(name) + price);
                } else {
                    map.put(name, price);
                }
            }

            double maxValue = map.firstEntry().getValue();
            for (double value : map.values()) {
                if (value > maxValue) {
                    maxValue = value;
                }
            }

            TreeSet<String> set = new TreeSet<>();
            for (String key : map.keySet()) {
                if (map.get(key) == maxValue) {
                    set.add(key);
                }
            }

            for (String setKey : set) {
                System.out.println(setKey);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
