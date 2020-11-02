package javacore.level3.lectore_11;

/*
Писатель в файл с консоли
 */


import java.io.*;


public class Solution_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String destinationFileName = reader.readLine();
        BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFileName));
        StringBuilder builder = new StringBuilder();
        String s = "";
        while (!s.equals("exit")){
            s = reader.readLine();
            builder.append(s).append("\n");
        }
        writer.write(builder.toString());
        writer.close();
        reader.close();

    }


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
}