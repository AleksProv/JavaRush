package javacore.level9.lectore_11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Знакомство с тегами
 * Считайте с консоли имя файла, который имеет HTML-формат.
 * Пример: Info about Leela
 * <span xml:lang="en" lang="en"><b><span>Turanga Leela </span></b></span><span>Super</span><span>girl</span>
 * Первым параметром в метод main приходит тег. Например, "span". Вывести на консоль все теги, которые соответству
 */

public class Solution_2 {  //d:/006/file5.txt

    public static void main(String[] args) throws IOException {
        args = new String[]{"span"};
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
        StringBuffer stringBuffer = new StringBuffer();
        while (fileReader.ready()) {
            stringBuffer.append(fileReader.readLine());
        }
        fileReader.close();

        String str = stringBuffer.toString().replaceAll("\r\n","");
        String openTag = "<" + args[0];
        String closeTag = "</" + args[0] + ">";

        ArrayList<Integer> positionOn = new ArrayList<>();
        ArrayList<Integer> positionOff = new ArrayList<>();
        Pattern pattern1 = Pattern.compile(openTag);
        Matcher matcher1 = pattern1.matcher(stringBuffer);
        while (matcher1.find()) {
            int start = matcher1.start();
            positionOn.add(start);
        }
////            int end = matcher1.end();
////            System.out.println("Найдено совпадение " + str.substring(start, end) + " с " + start + " по " + (end - 1) + " позицию");
////            System.out.println("Найдено совпадение " + str.substring(start) + " с " + start);


        Pattern pattern2 = Pattern.compile(closeTag);
        Matcher matcher2 = pattern2.matcher(stringBuffer);
        while (matcher2.find()) {
            int start = matcher2.start();
            positionOff.add(start);
        }

        int closeID, openID, level = 0;
        String lineTag = "";
        while (positionOn.size() != 0) {
            for (int i = 0; i < positionOn.size(); i++) {
                if (positionOn.get(i) < positionOff.get(0)) level++;
                else break;
            }
            for (int i = level - 1; i >= 0; i--) {
                openID = positionOn.get(0);
                closeID = positionOff.get(i);
                lineTag = str.substring(openID, closeID);
                System.out.println(lineTag + closeTag);
                positionOn.remove(0);
                positionOff.remove(i);
                level = 0;
                break;
            }
        }
    }
}

// 2 вариант
//        ArrayList<Integer> openList = new ArrayList<>();
//        int startIndex = 0;
//        int index;
//        while (true) {
//            index = stringBuffer.indexOf(openTag, startIndex);
//            if (index == -1) break;
//            openList.add(index);
//            startIndex = index+1;
//        }
//
//        ArrayList<Integer> closeList = new ArrayList<>();
//        startIndex = 0;
//        while (true) {
//            index = stringBuffer.indexOf(closeTag, startIndex);
//            if (index == -1) break;
//            closeList.add(index);
//            startIndex = index+1;
//        }
//        int closeID, openID, level = 0;
//        while (openList.size() != 0) {
//            for (int i = 0; i < openList.size(); i++) {
//                if (openList.get(i) < closeList.get(0)) level++;
//                else break;
//            }
//            for (int i = level-1; i >= 0; i--) {
//                openID = openList.get(0);
//                closeID = closeList.get(i);
//                line = stringBuffer.substring(openID, closeID);
//                System.out.println(line+closeTag);
//                openList.remove(0);
//                closeList.remove(i);
//                level = 0;
//                break;
//            }
//        }
