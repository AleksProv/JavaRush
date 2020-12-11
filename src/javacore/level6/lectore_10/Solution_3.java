package javacore.level6.lectore_10;
/*
Снова intrrrupt
 */

public class Solution_3 {
    public static void main(String[] args) throws InterruptedException {
        TestThread testThread = new TestThread();
        testThread.start();
        Thread.sleep(6000);
        testThread.interrupt();
    }

    public static class TestThread extends Thread {
        @Override
        public void run() {
            try {
                while (!currentThread().isInterrupted()) {
                    for (int i = 5; i >= 0; i--) {
                        System.out.println("Отсчет " + i);
                        Thread.sleep(1000);
                    }
                }
            } catch (InterruptedException e) {
                System.out.println("Вышли с потока");
            }
        }
    }
}
