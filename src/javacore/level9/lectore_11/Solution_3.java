package javacore.level9.lectore_11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeMap;

/**
 * Считаем зарплаты
 * В метод main первым параметром приходит имя файла.
 * В этом файле каждая строка имеет следующий вид:
 * имя значение где [имя] - String, [значение] - double. [имя] и [значение] разделены пробелом.
 * Для каждого имени посчитать сумму всех его значений. Все данные вывести в консоль, предварительно отсортировав
 */

public class Solution_3 {
    public static void main(String[] args) {
        args = new String[]{"d:/zap.txt"};
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
            for (String key : map.keySet()) {
                System.out.println(key + " " + map.get(key));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
