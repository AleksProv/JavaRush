package javacore.level6.lectore_10;
/*
Один для всех, все - для одного
 */

import java.util.ArrayList;
import java.util.List;

public class Solution_5 {
    public static byte threadCount = 3;
    static List<Thread> threads = new ArrayList<>(threadCount);

    public static void main(String[] args) throws InterruptedException {
        initThreadsAndStart();
        Thread.sleep(3000);
        ourInterruptMethod();
    }

    public static void ourInterruptMethod() {
        for (Thread thread : threads) {
            thread.interrupt();
        }
    }

    private static void initThreadsAndStart() {
        Water water = new Water("water");
        for (int i = 0; i < threadCount; i++) {
            threads.add(new Thread(water, "#" + i));
        }
        for (int i = 0; i < threadCount; i++) {
            threads.get(i).start();
        }

    }

    public static class Water implements Runnable {
        private String sharedResourse;

        public Water(String sharedResourse) {
            this.sharedResourse = sharedResourse;
        }

        @Override
        public void run() {
            String threadName = Thread.currentThread().getName();
            boolean isCurrentThreadInterrupted = Thread.currentThread().isInterrupted();
            try {
                while (!isCurrentThreadInterrupted) {
                    System.out.println("Объект " + sharedResourse + ", нить " + threadName);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {}
        }
    }

}