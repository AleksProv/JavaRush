package javacore.level8.lectore_11;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Английские буквы
 * В метод main первым параметром приходит имя файла.
 * Посчитать количество букв английского алфавита, которое есть в этом файле.
 * Вывести на экран число (количество букв). Закрыть потоки.
 */

public class Solution_5 {
    public static void main(String[] args) {
        args = new String[]{"d:/file.txt"};
        Character[] english = new Character[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
                'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
                'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p',
                'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        Set<Character> englishSet = new HashSet<>(Arrays.asList(english));
        int count = 0;
        try (FileReader fileReader = new FileReader(args[0])) {
            while (fileReader.ready()) {
                char readChar = (char) fileReader.read();
                if (englishSet.contains(readChar)) {
                    count++;
                }
            }
            System.out.println(count);
        } catch (IOException e) {
        }
    }
}

// 1 вариант
//        try (BufferedReader fileReader = new BufferedReader(new FileReader(args[0]))) {
//            String line;
//            while ((line = fileReader.readLine()) != null) {
//                for (int i = 0; i < line.length(); i++) {
//                    for (int j = 0; j < english.length; j++) {
//                        if (line.toUpperCase().charAt(i) == english[j]) {
//                            count++;
//                        }
//                    }
//                }
//            }
//            System.out.println(count);
//        } catch (IOException e) {
//        }
