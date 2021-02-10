package javacore.level8.lectore_11;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


/**
 * Java Core,  8 уровень,  11 лекция
 * Прайсы
 * CrUD для таблицы внутри файла. Считать с консоли имя файла для операций CrUD.
 * Программа запускается со следующим набором параметров: -c productName price quantity
 * Значения параметров:
 * где id - 8 символов.
 * productName - название товара, 30 символов.
 * price - цена, 8 символов.
 * quantity - количество, 4 символа.
 */

public class Solution_3 {  // d:/data2.txt
    public static void main(String[] args) throws Exception {
        String idMax;
        args = new String[]{"-c", "Слива краснодарская", "13", "17"};

        if (args.length == 0) {
            return;
        }

        List<String> listProdukt = new ArrayList<>();
        List<Integer> idProdukt = new ArrayList<>();

//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String inputFile = reader.readLine();
        String inputFile = "d:/data2.txt";
        try (BufferedReader fileReader = new BufferedReader(new FileReader(inputFile))) {
            while (fileReader.ready()) {
                    listProdukt.add(fileReader.readLine());
            }
        } catch (FileNotFoundException e) {
        }


        if (!listProdukt.isEmpty()) {
            for (String pear : listProdukt) {
                String aaa = pear.substring(0, 8);
                aaa = aaa.replaceAll("[^0-9]", "");
                idProdukt.add(Integer.parseInt(aaa));
            }
            idMax = Integer.toString(Collections.max(idProdukt) + 1);
        } else {
            idMax = "1111";
        }

        listProdukt.add(formatString(idMax, 8) + formatString(args[1], 30) +
                formatString(args[2], 8) + formatString(args[3], 4));

        try (FileWriter fileWriter = new FileWriter(inputFile, false)) {
            for (String pear : listProdukt) {
                fileWriter.write(pear);
                fileWriter.write(System.lineSeparator());
            }
        } catch (FileNotFoundException e) {
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


