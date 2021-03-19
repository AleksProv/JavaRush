package javacore.level8.lectore_11;

import java.io.*;

/**
 * Файлы и исключения
 * Читайте с консоли имена файлов.
 * Если файла не существует (передано неправильное имя файла), то перехватить исключение FileNotFoundException,
 * вывести в консоль переданное неправильное имя файла и завершить работу программы.
 * Закрыть потоки.
 * Не используйте System.exit();
 */

public class Solution_13 {
    public static void main(String[] args) throws IOException {
        String line;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while ((line = reader.readLine()) != null) {
            try (FileInputStream inputStream = new FileInputStream(line)) {
            } catch (FileNotFoundException e) {
                System.out.println(line);
                break;
            }
        }
    }
}
