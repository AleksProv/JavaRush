package javacore.level6.lectore_13;

/*
Последовательные выполнения нитей
 */
public class Solution_3 {
    public static MyThread t = new MyThread();
    static String message = "inside main ";

    public static void main(String[] args) throws Exception {
        t.start();
        t.join();
        for (int i = 0; i < 10; i++) {
            System.out.println(message + i);
            sleep();
        }
    }


    public static void sleep() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    static class MyThread extends Thread {
        String message = "inside MyThread ";

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println(message + i);
                Solution_3.sleep();
            }
        }
    }

}