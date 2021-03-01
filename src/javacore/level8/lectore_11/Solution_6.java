package javacore.level8.lectore_11;

import java.io.FileReader;
import java.io.IOException;

/**
 * Пробелы
 * В метод main первым параметром приходит имя файла.
 * Вывести на экран соотношение количества пробелов к количеству всех символов. Например, 10.45
 * 1. Посчитать количество всех символов.
 * 2. Посчитать количество пробелов.
 * 3. Вывести на экран п2/п1*100, округлив до 2 знаков после запятой.
 * 4. Закрыть поток
 */

public class Solution_6 {

    public static void main(String[] args) {
        args = new String[]{"d:/file.txt"};
        int countSpace = 0;
        int countSymbol = 0;
        try (FileReader fileReader = new FileReader(args[0])) {
            while (fileReader.ready()) {
                int readChar = fileReader.read();
                if (readChar == (int) ' ') {
                    countSpace++;
                }
                countSymbol++;
            }
            if (countSymbol != 0) {
                System.out.printf("%.2f", (double) countSpace / countSymbol * 100);
            }
        } catch (IOException e) {
        }
    }
}
