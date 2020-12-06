package javacore.level6.lectore_3;

/*
My second thread
 */

public class Solution_2 {
    public static void main(String[] args) {
        TestThread thread = new TestThread();
        thread.start();
    }

    public static class TestThread extends Thread {
        static {
            System.out.println("it's static block inside TestThread");
        }
        @Override
        public void run() {
            System.out.println("it's a run method");
        }
    }

}