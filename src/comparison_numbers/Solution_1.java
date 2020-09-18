package comparison_numbers;

/*
Сортировка пузырьком
 */

import java.util.Arrays;

public class Solution_1 {
    public static void main (String[] args) {
        System.out.println ("Массив для сортировки");
        int[] array = {5, 2, 6};
        int changeCounter;
        do {
            changeCounter = 0;
            for (int index = 0; index < array.length - 1; index++) {
                if (array[index] > array[index + 1]) {
                    int temp = array[index];
                    array[index] = array[index + 1];
                    array[index + 1] = temp;
                    changeCounter++;
                }
            }
        } while (changeCounter > 0);
        System.out.println (Arrays.toString (array));
    }
}
