package level9.lectore_2;

/*
Логирование стек-трейса
 */

public class Solution_6 {
    public static void main (String[] args) {
        log ("In main method");
    }

    public static void log (String s) {
        System.out.print (Thread.currentThread ().getStackTrace ()[2].getClassName () + ": ");
        System.out.println (Thread.currentThread ().getStackTrace ()[2].getMethodName () + ": " + s);
    }
}