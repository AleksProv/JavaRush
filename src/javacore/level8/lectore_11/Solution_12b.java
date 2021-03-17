package javacore.level8.lectore_11;

import java.io.*;

/**
 * Максимальное колличество встречи байта в файле (для Solution_12)
 */

public class Solution_12b {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = "d:/line1.txt";
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
                    System.out.println(i + " " + aSCII[i]);
                }
            }
            System.out.println(maxName + "  " + countMax);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
