package javasyntax.level9.lectore_2;
/*
Там, в синих глубинах стейк-трейса.
 */

public class Solution_5 {
    public static void main (String[] args) {
        int deep = getStackTraceDepth ();
    }

    public static int getStackTraceDepth () {
        int deep = Thread.currentThread ().getStackTrace ().length;
        System.out.println (deep);
        return deep;
    }
}