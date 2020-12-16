package javacore.level6.lectore_13;

/*
Thread.currentThread - всегда возвращает текущую нить
 */

public class Solution_4 {
    static int count = 5;

    public static void main(String[] args) {
        ThreadNamePrinter tnp = new ThreadNamePrinter();
        tnp.start();
        for (int i = 0; i < count; i++) {
            tnp.printMsg();
        }
    }

    public static class ThreadNamePrinter extends Thread{
        @Override
        public void run() {
            for (int i = 0; i < count; i++) {
                printMsg();
            }
        }

        public void printMsg() {
            Thread t = Thread.currentThread();
            String name = t.getName();
            System.out.println("Name=" + name);
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
