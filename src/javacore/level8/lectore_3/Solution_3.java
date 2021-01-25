package javacore.level8.lectore_3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Самые частые байты
 * Ввести с консоли имя файла. Найти байт или байты с максимальным количеством повторов.
 * Вывести их на экран через пробел. Закрыть поток ввода-вывода.
 */

public class Solution_3 {
    public static void main(String[] args) throws Exception {  // путь d:/file3.txt
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(reader.readLine());
        List<Integer> listByte = new ArrayList<>();
        Map<Integer, Integer> mapMax = new HashMap<>();
        int currentByte;
        int countCurrent = 0;
        int countMax = 0;
        while (fileInputStream.available() > 0) {
            currentByte = fileInputStream.read();
            listByte.add(currentByte);
        }
        System.out.println(listByte);
        for (int i = 0; i < listByte.size(); i++) {
            for (int j = 0; j < listByte.size(); j++) {
                if (listByte.get(i).equals(listByte.get(j))) {
                    countCurrent++;
                }
            }
            mapMax.put(listByte.get(i), countCurrent);
            if (countCurrent > countMax) {
                countMax = countCurrent;
            }
            countCurrent = 0;
        }
        for (Map.Entry<Integer, Integer> key : mapMax.entrySet()) {
            if (key.getValue().equals(countMax)) {
                System.out.print(key.getKey() + " ");
            }
        }
        fileInputStream.close();
        reader.close();
    }
}
