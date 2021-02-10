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

public class Solution_2 {  // d:/data2.txt
    public static void main(String[] args) throws Exception {
        args = new String[]{"-c", "Груша", "10", "10"};

        if (args.length == 0) {
            return;
        }

        List<String> listProdukt = new ArrayList<>();
        List<Integer> idProdukt = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputFile = reader.readLine();
        try (FileInputStream inputStream = new FileInputStream(inputFile)) {
            Scanner scanner = new Scanner(inputStream);
            while (scanner.hasNext()) {
                listProdukt.add(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
        }

        for (String pear : listProdukt) {
            String aaa = pear.substring(0, 8);
            aaa = aaa.replaceAll("[^0-9]", "");
            idProdukt.add(Integer.parseInt(aaa));
        }

        String idMax = Integer.toString(Collections.max(idProdukt) + 1);

        listProdukt.add(formatString(idMax, 8) + formatString(args[1], 30) +
                        formatString(args[2], 8) + formatString(args[3], 4));

        try (FileOutputStream fileOutputStream = new FileOutputStream(inputFile,false)) {
            for (String pear : listProdukt) {
                fileOutputStream.write(pear.getBytes());
                fileOutputStream.write(System.lineSeparator().getBytes());
            }
        } catch (IOException e) {
        }

    }

    public static String formatString(String str, int position) {
        StringBuffer buffer = new StringBuffer(position);
        int to = position - str.length();
        buffer.append(str);
        for (int i = 0; i < to; i++) {
            buffer.append(" ");
        }
        return buffer.toString();
    }
}


