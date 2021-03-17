package javacore.level8.lectore_11;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Нити и байты
 * Читайте с консоли имена файлов, пока не будет введено слово "exit".
 * Передайте имя файла в нить ReadThread. Нить ReadThread должна найти байт,
 * который встречается в файле максимальное число раз, и добавить его в словарь resultMap,
 * где параметр String - это имя файла, параметр Integer - это искомый байт
 */

public class Solution_12 { // "d:/line1.txt"
    public static Map<String, Integer> resultMap = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while (!(line = reader.readLine()).equals("exit")) {
           new ReadThread(line).start();
        }
        System.out.println(resultMap);
        reader.close();
    }


    public static class ReadThread extends Thread {
        private String fileName;

        public ReadThread(String fileName) {
            this.fileName = fileName;
        }

        @Override
        public void run() {
            int[] aSCII = new int[256];
            try (FileInputStream inputStream = new FileInputStream(fileName)) {
                while (inputStream.available() > 0) {
                    aSCII[inputStream.read()]++;
                }
                int countMax = 0;
                int maxName = 0;
                for (int i = 0; i < aSCII.length; i++) {
                    if (aSCII[i] != 0) {
                        if (aSCII[i] > countMax) {
                            countMax = aSCII[i];
                            maxName = i;
                        }
                    }
                }
                resultMap.put(fileName, maxName);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
