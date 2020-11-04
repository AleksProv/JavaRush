package javacore.level3.lectore_11;

/*
Èםעונפויס SimpleObject
 */

public class Solution_6 {
    public static void main(String[] args) {
        SimpleObject<String> stringObject = new StringObject();
    }

    interface SimpleObject<T> {
        SimpleObject<T> getInstance();
    }

    public static class StringObject implements SimpleObject<String> {
        @Override
        public SimpleObject<String> getInstance() {
            return null;
        }
    }


}

