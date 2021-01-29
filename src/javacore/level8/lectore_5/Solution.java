package javacore.level8.lectore_5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Исправить ошибки
 * Исправить функциональность в соответствии с требованиями. Программа должна: 1.
 * Переписать все байты одного файла в другой одним куском. 2.
 * Закрывать потоки ввода-вывода. Подсказка: 4 ошибки.
 */

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("d:/data.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("d:/result.txt");
        if (inputStream.available() > 0) {
            byte[] buffer = new byte[inputStream.available()];
            int count = inputStream.read(buffer);
            fileOutputStream.write(buffer, 0, count);
        }
// 2 вариант
//        byte[] buffer = new byte[1000];
//        while (inputStream.available() > 0) //пока есть еще непрочитанные байты
//        {
//            // прочитать очередной блок байт в переменную buffer и реальное количество в count
//            int count = inputStream.read(buffer);
//            fileOutputStream.write(buffer, 0, count); //записать блок(часть блока) во второй поток
//        }
        inputStream.close();
        fileOutputStream.close();
    }
}
