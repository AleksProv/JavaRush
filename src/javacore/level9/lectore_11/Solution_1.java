package javacore.level9.lectore_11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Отслеживаем изменения
 * Считайте с консоли два имени файла — file1, file2.
 * Эти файлы содержат строки, причём file2 является обновленной версией file1, часть строк совпадают.
 * Создайте объединенную версию строк и запишите их в список lines.
 */

public class Solution_1 {  //d:/006/file1.txt
    public static List<LineItem> lines = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();

        ArrayList<String> fileContent1 = new ArrayList<>();
        ArrayList<String> fileContent2 = new ArrayList<>();

        BufferedReader fileReader1 = new BufferedReader(new FileReader(file1));
        BufferedReader fileReader2 = new BufferedReader(new FileReader(file2));

        while (fileReader1.ready()) {
            fileContent1.add(fileReader1.readLine());
        }
        while (fileReader2.ready()) {
            fileContent2.add(fileReader2.readLine());
        }


        int lineFile1 = 0;
        int lineFile2 = 0;

        while ((lineFile1 < fileContent1.size()) && (lineFile2 < fileContent2.size())) {
            if (fileContent1.get(lineFile1).equals(fileContent2.get(lineFile2))) {
                lines.add(new LineItem(Type.SAME, fileContent1.get(lineFile1)));
                lineFile1++;
                lineFile2++;
            } else if ((lineFile1 + 1 < fileContent1.size()) && fileContent1.get(lineFile1 + 1).equals(fileContent2.get(lineFile2))) {
                lines.add(new LineItem(Type.REMOVED, fileContent1.get(lineFile1)));
                lineFile1++;
            } else if ((lineFile2 + 1 < fileContent2.size()) && fileContent1.get(lineFile1).equals(fileContent2.get(lineFile2 + 1))) {
                lines.add(new LineItem(Type.ADDED, fileContent2.get(lineFile2)));
                lineFile2++;
            }
        }

        while (lineFile1 < fileContent1.size()) {
            lines.add(new LineItem(Type.REMOVED, fileContent1.get(lineFile1)));
            lineFile1++;
        }
        while (lineFile2 < fileContent2.size()) {
            lines.add(new LineItem(Type.ADDED, fileContent2.get(lineFile2)));
            lineFile2++;
        }

        fileReader1.close();
        fileReader2.close();

        for (LineItem pear : lines) {
            System.out.println(pear.toString());
        }
    }

    public enum Type {
        ADDED,      //добавлена новая строка
        REMOVED,    //удалена строка
        SAME        //без изменений
    }


    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }

        @Override
        public String toString() {
            return type + " " + line;
        }
    }
}
