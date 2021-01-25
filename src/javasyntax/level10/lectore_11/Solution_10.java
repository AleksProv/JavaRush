package javasyntax.level10.lectore_11;
/*
Задача по алгоритмам I Java Syntax: 10 уровень, 11 лекция
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_10 {
    public static void main (String[] args) throws Exception{
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        int[] array = new int[30];
        for (int i = 0; i < 30; i++) {
            array[i] = Integer.parseInt (reader.readLine ());
        }
        sort(array);
        System.out.println (array[9]);
        System.out.println (array[10]);
    }

    public static void sort(int[] array){
        int arrSort;
        int index;
        for (int i = 0; i < array.length; i++) {
            arrSort = array[i];
            index = i;
            while (index > 0 && array[index-1] > arrSort) {
                array[index] = array[index-1];
                index-- ;
                array[index] = arrSort;
            }
        }
    }
}