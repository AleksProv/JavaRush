package level10.lectore_11.bankomat;

public class Bankomat {
    static BankAccount account = new BankAccount("Amigo");
    public static volatile boolean isStopped;

    public static void main(String[] args) throws InterruptedException {
        addMoney.start();
        SpendThread spendThread = new SpendThread();
        SpendThread spendThread2 = new SpendThread();
        SpendThread spendThread3 = new SpendThread();
        spendThread.start();
        spendThread2.start();
        spendThread3.start();
        Thread.sleep(4000);
        isStopped = true;
    }

    private static Thread addMoney = new Thread() {
        @Override
        public void run() {
            while (!isStopped) {
                account.deposit("1000");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    break;
                }
            }
        }
    };

    public static class SpendThread extends Thread {
        @Override
        public void run() {
            while (!isStopped) {
                try {
                    account.withdraw("100");
                } catch (NotEnoughMoneyException e) {
                    System.out.println("Недостаточно денег");
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    break;
                }
            }
        }
    }
}
