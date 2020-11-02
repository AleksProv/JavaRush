package javacore.level3.lectore_11;

/*
Чтение файла
 */

import java.io.*;
import java.nio.charset.Charset;
import java.util.Scanner;


public class Solution_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sourceFileMame = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(sourceFileMame);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream,Charset.forName("windows-1251"));

        Scanner scanner = new Scanner(inputStreamReader);
        StringBuilder builder = new StringBuilder();

        while (scanner.hasNext()) {
            builder.append(scanner.nextLine()).append("\n");
        }
        System.out.println(builder.toString());

        scanner.close();
        reader.close();

    }
}

// свой вариант
//public class Solution_2 {
//    public static void main(String[] args)  {
//        int b = 0;
//        FileInputStream fis = null;
//        InputStreamReader inp = null;
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//
//        try {
//            fis = new FileInputStream(reader.readLine());
//            inp = new InputStreamReader(fis, Charset.forName("windows-1251"));
//            while ((b = inp.read()) != -1) {
//                System.out.print((char) b);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                reader.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            try {
//                assert fis != null;
//                fis.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            try {
//                assert inp != null;
//                inp.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//
//    }
//}
