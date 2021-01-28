package javacore.level8.lectore_3;

import javacore.level5.lectore_12.debag.Solution;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Самые редкие байты
 * Ввести с консоли имя файла. Найти байт или байты с минимальным количеством повторов.
 * Вывести их на экран через пробел. Закрыть поток ввода-вывода.
 */

public class Solution_4 {
    public static void main(String[] args) throws Exception { // d:/file3.txt
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        int[] byteCountArray = new int[256];
        try (FileInputStream fileInputStream = new FileInputStream(fileName)) {
            while (fileInputStream.available() > 0) {
                byteCountArray[fileInputStream.read()] += 1;
            }
        }
        int minCount = Integer.MAX_VALUE;
        for (int byteCount : byteCountArray) {
            if (byteCount > 0 && byteCount < minCount) {
                minCount = byteCount;
            }
        }
        ArrayList<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < byteCountArray.length; i++) {
            if (byteCountArray[i] == minCount){
                resultList.add(i);
            }
        }
        for (Integer resultItem : resultList) {
            System.out.print(resultItem + " ");
        }


        // 1
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        FileInputStream fileInputStream = new FileInputStream(reader.readLine());
//        ArrayList<Integer> listByte = new ArrayList<>();
//        Map<Integer, Integer> mapMax = new HashMap<>();
//        int currentByte;
//        int countCurrent = 0;
//        int countMin = 1;
//        while (fileInputStream.available() > 0) {
//            currentByte = fileInputStream.read();
//            listByte.add(currentByte);
//        }
//        System.out.println(listByte);
//        for (int i = 0; i < listByte.size(); i++) {
//            for (int j = 0; j < listByte.size(); j++) {
//                if (listByte.get(i).equals(listByte.get(j))) {
//                    countCurrent++;
//                }
//            }
//            mapMax.put(listByte.get(i), countCurrent);
//            if (countCurrent < countMin) {
//                countMin = countCurrent;
//            }
//            countCurrent = 0;
//        }
//        for (Map.Entry<Integer, Integer> key : mapMax.entrySet()) {
//            if (key.getValue().equals(countMin)) {
//                System.out.print(key.getKey() + " ");
//            }
//        }
//        fileInputStream.close();
//        reader.close();
    }
}
