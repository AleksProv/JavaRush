package javacore.level8.lectore_3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

/**
 * Сортировка байт
 * Ввести с консоли имя файла. Считать все байты из файла.
 * Не учитывая повторений - отсортировать их по байт-коду в возрастающем порядке.
 * Вывести на экран. Закрыть поток ввода-вывода. Пример байт входного файла: 44 83 44 Пример вывода: 44 83
 */

public class Solution_5 {
    public static void main(String[] args) throws Exception { // d:/file3.txt
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        Set<Integer> resultSet = new TreeSet<>();

        try (FileInputStream fileInputStream = new FileInputStream(fileName)) {
            while (fileInputStream.available() > 0) {
                resultSet.add(fileInputStream.read());
            }
        }
        for (Integer resultItem : resultSet) {
            System.out.print(resultItem + " ");
        }
    }
}
