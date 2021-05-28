package javacore.level10.lectore_2.properties;

import javacore.level10.lectore_2.javarush.User;

import java.io.*;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * Знакомство с properties
 * .properties — текстовый формат и одноимённое расширение имени файла.
 * Его применяют для хранения конфигурационных параметров (пар «ключ» — «значение»).
 * В методе fillInPropertiesMap считаем имя файла с консоли и заполним карту properties данными из файла.
 * И — главное — реализуем логику записи в файл и чтения из файла для карты properties.
 */

public class Solution {
    public static Map<String, String> runtimeStorage = new HashMap<>();

    public static void save(OutputStream outputStream) throws Exception {
        Properties properties = new Properties();
        for (Map.Entry<String, String> pair : runtimeStorage.entrySet()) {
            properties.setProperty(pair.getKey(), pair.getValue());
        }
        properties.store(outputStream, null);
    }

    public static void load(InputStream inputStream) throws IOException {
        Properties properties = new Properties();
        properties.load(inputStream);
        for (Map.Entry<Object, Object> pair : properties.entrySet()) {
            runtimeStorage.put(pair.getKey().toString(), pair.getValue().toString());
        }
    }

    public static void main(String[] args) { //  D:\JavaRush\src\javacore\level10\lectore_2\properties\file.properties
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream fos = new FileInputStream(reader.readLine())) {
            load(fos);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(runtimeStorage);
    }
}