package javacore.level2.lectore_12;

/*
Изоморфы наступают
 */

import java.util.Arrays;

public class Solution_4 {
    public static void main(String[] args) {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

        Pair<Integer, Integer> result = getMinimumAndIndex(data);

        System.out.println("The minimum is " + result.x);
        System.out.println("The index of the minimum element is " + result.y);
    }

    public static Pair<Integer, Integer> getMinimumAndIndex(int[] array) {
        if (array == null || array.length == 0) {
            return new Pair<Integer, Integer>(null, null);
        }

        int[] newArray = array.clone();
        Arrays.sort(newArray);
        int minimum = newArray[0];
        int indexMin = 0;
        for ( Integer element : array ) {
            if (element == minimum)
                break;
            indexMin++;
        }
        return new Pair<Integer, Integer>(minimum, indexMin);
    }

    public static class Pair<X, Y> {
        public X x;
        public Y y;

        public Pair(X x, Y y) {
            this.x = x;
            this.y = y;
        }
    }
}