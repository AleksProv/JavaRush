package javacore.level5.lectore_12.statics;

/*
Файл в статическом блоке
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static List<String> lines = new ArrayList<>();

    static {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(Statics.FILE_NAME);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Scanner scanner = new Scanner(fileInputStream);
        while (scanner.hasNext()) {
            lines.add(scanner.nextLine());
        }
        scanner.close();
        try {
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println(lines);
    }

}