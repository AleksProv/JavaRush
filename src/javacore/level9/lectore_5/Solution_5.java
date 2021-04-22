package javacore.level9.lectore_5;

import java.io.*;
import java.util.ArrayList;

/**
 * Пунктуация
 * Считать с консоли 2 имени файла. Первый Файл содержит текст.
 * Считать содержимое первого файла, удалить все знаки пунктуации, включая символы новой строки.
 * Результат вывести во второй файл. Закрыть потоки.
 */

public class Solution_5 { //d:/003/file5.txt
    public static void main(String[] args) throws IOException {
        String inputFileName;
        String outputFileName;

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            inputFileName = reader.readLine();
            outputFileName = reader.readLine();
        }

        ArrayList<String> fileContent = new ArrayList<>();
        try (BufferedReader fileReader = new BufferedReader(new FileReader(inputFileName))) {
            while (fileReader.ready()) {
                fileContent.add(fileReader.readLine());
            }
        }
        try (BufferedWriter fileWriter = new BufferedWriter(new FileWriter(outputFileName))) {
            for (String line : fileContent) {
                String replaceString = line.replaceAll("\\p{P}", "");
                fileWriter.write(replaceString);
            }
        }
    }
}
