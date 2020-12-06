package javacore.level6.lectore_3;

/*
Вывод стек-трейса
 */

public class Solution_5 {
    public static void main(String[] args) throws InterruptedException{
        Thread thread = new Thread(new SpecialThread());
        thread.start();

        System.out.println("**********************");
        for (StackTraceElement element : Thread.currentThread().getStackTrace()) {
            System.out.println(element);
        }
    }

    public static class SpecialThread implements  Runnable{
        @Override
        public void run() {
            for (StackTraceElement element2 : Thread.currentThread().getStackTrace()) {
                System.out.println(element2);
            }
        }
    }

}