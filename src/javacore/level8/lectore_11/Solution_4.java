package javacore.level8.lectore_11;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


/**
 * Java Core,  8 уровень,  11 лекция
 * Прайсы 2
 * CrUD для таблицы внутри файла Считать с консоли имя файла для операций CrUD
 * Программа запускается с одним из следующих наборов параметров:
 * -u id productName price quantity
 * -d id
 * Значения параметров: где
 * id - 8 символов
 * productName - название товара,30 chars (60 bytes)
 * price - цена, 8 символов
 * quantity - количество, 4 символа.
 */

public class Solution_4 {  // d:/data2.txt
    public static void main(String[] args) throws IOException {
        args = new String[]{"-u", "1111", "Слива вкусная", "100", "170"};
//        args = new String[]{"-d", "1112"};

        if (args.length == 0) {
            return;
        }

        List<String> listProdukt = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputFile = reader.readLine();
        try (BufferedReader fileReader = new BufferedReader(new FileReader(inputFile))) {
            String c;
            while ((c = fileReader.readLine()) != null) {
                listProdukt.add(c);
            }
        } catch (IOException e) {
        }

        switch (args[0]) {
            case ("-u"):
                upCrud(args, inputFile, listProdukt);
                break;
            case ("-d"):
                delCrud(args, inputFile, listProdukt);
                break;
        }
    }

    public static void delCrud(String[] args, String inputFile, List<String> listProdukt) {
        try (FileWriter fileWriter = new FileWriter(inputFile, false)) {
            for (String pear : listProdukt) {
                String aaa = pear.substring(0, 8);
                if (args[1].equals(aaa.trim())) {
                    continue;
                } else {
                    fileWriter.write(pear);
                    fileWriter.write(System.lineSeparator());
                }
            }
        } catch (IOException e) {
        }
    }

    public static void upCrud(String[] args, String inputFile, List<String> listProdukt) {
        try (FileWriter fileWriter = new FileWriter(inputFile, false)) {
            for (String pear : listProdukt) {
                String aaa = pear.substring(0, 8);
                if (args[1].equals(aaa.trim())) {
                    fileWriter.write(formatString(args[1], 8) + formatString(args[2], 30) +
                            formatString(args[3], 8) + formatString(args[4], 4));
                } else {
                    fileWriter.write(pear);
                }
                fileWriter.write(System.lineSeparator());
            }
        } catch (IOException e) {
        }
    }

    public static String formatString(String str, int position) {
        StringBuffer buffer = new StringBuffer(position);
        int toLength = position - str.length();
        buffer.append(str);
        for (int i = 0; i < toLength; i++) {
            buffer.append(" ");
        }
        return buffer.toString();
    }
}
