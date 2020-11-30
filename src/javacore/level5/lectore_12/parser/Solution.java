package javacore.level5.lectore_12.parser;
/*
парсер реквестов
//        String text1 = "http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo";
//        String text2 = "http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo";
//        String text2 = "http://javarush.ru/alpha/index.html?obj=txt&name=Amigo";
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String strokaUrl = reader.readLine();
        reader.close();
        int indexUrl = strokaUrl.indexOf("?") + 1;
        String lineValue = strokaUrl.substring(indexUrl);
        String[] value = lineValue.split("&");
        for (String s : value) {
            System.out.print(s.split("=")[0] + " ");
        }

        System.out.println();

        for (String s : value) {
            if (s.split("=")[0].equals("obj")){
                try {
                    alert(Double.parseDouble(s.split("=")[1]));
                } catch (Exception e) {
                    alert(s.split("=")[1]);
                }
            }
        }



//        String objValue = null;
//        StringBuilder stringBuilder  = new StringBuilder();
//        String[] value = lineValue.split("&");
//        for (String s : value) {
//            String[] parametr = s.split("=");
//            stringBuilder.append(parametr[0]);
//            stringBuilder.append(" ");
//
//            if (parametr[0].equals("obj")){
//                objValue = parametr[1];
//            }
//        }
//        System.out.println(stringBuilder.toString().trim());
//
//            if (objValue!=null){
//                try {
//                    alert(Double.parseDouble(objValue));
//                } catch (Exception e) {
//                    alert(objValue);
//                }
//            }

    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}