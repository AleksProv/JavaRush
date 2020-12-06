package javacore.level6.lectore_3;

public class Excample {
    public static void main(String[] args) {
        Printer printerTheFirst = new Printer("one");
        Thread thread1 = new Thread(printerTheFirst);

        Printer printerTheSecond = new Printer("another one");
        Thread thread2 = new Thread(printerTheSecond);

        thread1.start();
        thread2.start();
    }

    public static class Printer implements Runnable {
        private String name;

        public Printer(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                System.out.println(name);
            }
        }
    }
}