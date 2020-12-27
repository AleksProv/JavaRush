package javacore.level7.lectore_4;

/*
МВФ
 */

public class Solution_3 {
    public static void main(String[] args) {
        IMF fund = IMF.getFund();
        IMF anotherFund = IMF.getFund();
        System.out.println(fund == anotherFund);
    }

    public static class IMF {
        private static IMF imf;

        private IMF() {
        }

        public static IMF getFund() {
            if (imf == null)
                synchronized (IMF.class) {
                    if (imf == null) {
                        imf = new IMF();
                    }
                }
            return imf;
        }
    }
}