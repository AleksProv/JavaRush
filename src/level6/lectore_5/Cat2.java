package level6.lectore_5;

/*
Пустые кошки, пустые псы.
 */

public class Cat2 {

    public static void main (String[] args) {
    }

    protected void finalize () throws Throwable {
        System.out.println ("A Cat was destroyed");
    }
}

class Dog2 {
    protected void finalize () throws Throwable {
        System.out.println ("A Dog was destroyed");
    }
}