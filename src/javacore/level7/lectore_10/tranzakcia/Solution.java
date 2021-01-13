package javacore.level7.lectore_10.tranzakcia;
/*
Транзакционность (сравнить 2 списка)
 */

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution { // путь d:/file1.txt d:/file2.txt
    public static List<String> allLines = new ArrayList<>();
    public static List<String> forRemoveLines = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(reader.readLine());
        FileInputStream fileInputStream2 = new FileInputStream(reader.readLine());

        Scanner scanner = new Scanner(fileInputStream);
        while (scanner.hasNext()) {
            allLines.add(scanner.nextLine());
        }
        Scanner scanner2 = new Scanner(fileInputStream2);
        while (scanner2.hasNext()) {
            forRemoveLines.add(scanner2.nextLine());
        }

        scanner.close();
        scanner2.close();
        fileInputStream.close();
        fileInputStream2.close();
        reader.close();

        new Solution().joinData();

    }

    public void joinData() throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }

}