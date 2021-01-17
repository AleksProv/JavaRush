package thread;

public class MyThread implements Runnable {
    Thread thrd;

    public MyThread(String name) {
        thrd = new Thread(this, name);
    }

    public static MyThread createAndStart(String name) {
        MyThread myThread = new MyThread(name);
        myThread.thrd.start();
        return myThread;
    }

    @Override
    public void run() {
        System.out.println(thrd.getName() + " - запуск.");
        try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("В потоке - " + thrd.getName() + ", счетчик: " + count);
            }
        } catch (InterruptedException e) {
            System.out.println(thrd.getName() + " прерван.");
        }
        System.out.println(thrd.getName() + " - завершение потока.");
    }
}

class ThreadVariations {
    public static void main(String[] args) {
        System.out.println("Запуск основного потока.");
        MyThread mt1 = MyThread.createAndStart("Поток №1");
        MyThread mt2 = MyThread.createAndStart("Поток №2");
        MyThread mt3 = MyThread.createAndStart("Поток №3");

            try {
                mt1.thrd.join();
                System.out.println("Порожденный поток №1 - присоеденен.");
                mt2.thrd.join();
                System.out.println("Порожденный поток №2 - присоеденен.");
                mt3.thrd.join();
                System.out.println("Порожденный поток №3 - присоеденен.");
            } catch (InterruptedException e) {
                System.out.println("Прерывание основного потока.");
            }

        System.out.println("Завершение основного потока.");
    }
}