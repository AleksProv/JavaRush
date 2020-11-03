package javacore.level3.lectore_11;

/*
Писатель в файл с консоли
 */


import java.io.*;
import java.util.ArrayList;

public class Solution_3 {  //   путь d:/file2.txt
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new FileWriter(reader.readLine()));
        StringBuilder stringBuilder = new StringBuilder();
        String s = "";
        while (!s.equals("exit")) {
            s = reader.readLine();
            stringBuilder.append(s).append("\n");
        }
        writer.write(stringBuilder.toString());
        reader.close();
        writer.close();
    }
}

//вариант 4
//public class Solution_3 {  //   путь d:/file2.txt
//    public static void main(String[] args) {
//        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
//            try (BufferedWriter writer = new BufferedWriter(new FileWriter(reader.readLine()))) {
//                while (true) {
//                    String s = reader.readLine();
//                    writer.write(s + System.lineSeparator());
//
//                    if (s.equalsIgnoreCase("exit")) {
//                        reader.close();
//                        writer.close();
//                        break;
//                    }
//                }
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}


// вариант 3
//    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter writer = new BufferedWriter(new FileWriter(reader.readLine()));
//        ArrayList<String> arrayList = new ArrayList<>();
//        boolean isRead = true;
//
//        while (isRead) {
//            String s = reader.readLine();
//            arrayList.add(s);
//            switch (s) {
//                case "exit":
//                    isRead = false;
//                    reader.close();
//                    break;
//            }
//        }
//
//        for (String ss : arrayList) {
//            writer.write(ss + "\n");
//        }
//        writer.close();
//    }
//}


//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String destinationFileName = reader.readLine();
//        BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFileName));
//        StringBuilder builder = new StringBuilder();
//        String s = "";
//        while (!s.equals("exit")){
//            s = reader.readLine();
//            builder.append(s).append("\n");
//        }
//        writer.write(builder.toString());
//        writer.close();
//        reader.close();


// свой вариант
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        ArrayList<String> arrayList = new ArrayList<>();
//        String file = reader.readLine();
//
//        while (true) {
//            String stroka = reader.readLine();
//            if (stroka.equals("exit")){
//                arrayList.add(stroka);
//                break;
//            }
//            arrayList.add(stroka);
//        }
//
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
//
//        for (String pair : arrayList) {
//            bufferedWriter.write(pair);
//            bufferedWriter.flush();
//            bufferedWriter.newLine();
//        }
//        reader.close();
//        bufferedWriter.close();
//
//    }