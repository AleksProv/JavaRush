package javacore.level5.lectore_9;

/*
Статитки - 1
 */

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static Map<Double,String> labels = new HashMap<>();
    static {
        labels.put(12.11, "Pole1");
        labels.put(12.12, "Pole2");
        labels.put(12.13, "Pole3");
        labels.put(12.14, "Pole4");
        labels.put(12.15, "Pole5");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}