package javacore.level9.lectore_5;

import java.io.*;

/**
 * Считаем слово
 * Считать с консоли имя файла. Файл содержит слова, разделенные знаками препинания.
 * Вывести в консоль количество слов "world", которые встречаются в файле.
 * Закрыть потоки.
 */

public class Solution_2 {  //d:/003/file.txt
    private static int count = 0;

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine()))) {
            StringBuilder builder = new StringBuilder();
            char currentChar;
            while (fileReader.ready()) {
                currentChar = (char) fileReader.read();
                builder.append(currentChar);
            }
            String replaceString = builder.toString().replaceAll("\\p{P}", " ").replaceAll("\\s", " ");
            for (String s : replaceString.split(" ")) {
                if (s.equals("world")) {
                    count++;
                }
            }
            System.out.println(count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
