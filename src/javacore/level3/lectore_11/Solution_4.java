package javacore.level3.lectore_11;

/*
Сортировка четных чисел из файла
 */

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Solution_4 { // путь d:/file2.txt
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(reader.readLine());

        Scanner scanner = new Scanner(fileInputStream);

        List<Integer> data = new ArrayList<>();

        while (scanner.hasNext()) {
            int value = scanner.nextInt();
            if (value % 2 == 0) {
                data.add(value);
            }
        }
        scanner.close();
        reader.close();
        fileInputStream.close();

        Collections.sort(data);

        for (Integer pair : data) {
            System.out.println(pair);
        }
    }
}


//public class Solution_4 { // путь d:/file2.txt
//    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String sourceFileMame = reader.readLine();
//        FileInputStream fileInputStream = new FileInputStream(sourceFileMame);
//
//        Scanner scanner = new Scanner(fileInputStream);
//
//        ArrayList<Integer> arrayList = new ArrayList<>();
//
//        while (scanner.hasNext()) {
//            arrayList.add(Integer.parseInt(scanner.nextLine()));
//        }
//        scanner.close();
//        reader.close();
//
//
//        int[] newArray = new int[arrayList.size()];
//
//        for (int i = 0; i < arrayList.size(); i++) {
//            newArray[i] = arrayList.get(i);
//        }
//        Arrays.sort(newArray);
//
//        for (Integer pair : newArray) {
//            if (pair % 2 == 0)
//            System.out.println(pair);
//        }
//    }
//}