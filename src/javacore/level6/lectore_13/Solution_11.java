package javacore.level6.lectore_13;

/*
Последовательный вывод файлов
 */

import java.io.*;
import java.util.Scanner;

public class Solution_11 {
    public static String firstFileName;
    public static String secondFileName;

    static { // d://file1.txt  d://file2.txt
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            firstFileName = reader.readLine();
            secondFileName = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {
        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    public static class ReadFileThread extends Thread implements ReadFileInterface {
        public String fileName;
        public String result = "";

        @Override
        public void setFileName(String fullFileName) {
            this.fileName = fullFileName;
        }

// 1 вариант
//        @Override
//        public void run() {
//            FileInputStream fileInputStream = null;
//            try {
//                fileInputStream = new FileInputStream(fileName);
//            } catch (FileNotFoundException e) {
//                e.printStackTrace();
//            }
//            Scanner scanner = new Scanner(fileInputStream);
//            while (scanner.hasNext()) {
//                result += scanner.nextLine() + " ";
//            }
//            scanner.close();
//        }

        // 2 вариант
        @Override
        public void run() {
            String line;
            try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
                while ((line = br.readLine()) != null) {
                    result += line + " ";
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        @Override
        public String getFileContent() {
            return result;
        }

    }

}