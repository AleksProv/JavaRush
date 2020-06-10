package comparison_numbers;

import java.util.ArrayList;
import java.util.Comparator;

public class Solution {
    public static void main(String[] args) {
        int[] arr = new int[]{6, 3, 2};
        int arrSort;
        int index;
        for (int i = 0; i < arr.length; i++) {
            arrSort = arr[i];
            index = i;
            while (index > 0 && arr[index-1] > arrSort) {
                arr[index] = arr[index-1];
                index-- ;
                arr[index] = arrSort;
            }
        }
        for (int temp: arr ) {
            System.out.println(temp);
        }
    }
}