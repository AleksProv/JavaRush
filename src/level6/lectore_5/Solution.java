package level6.lectore_5;

/*
По 50 000 объектов Cat и Dog.
 */

public class Solution {

    public static void main (String[] args) {
        int i = 0;
        while (i < 50000) {
            Cat3 cat = new Cat3 ();
            Dog dog = new Dog ();
            i++;
        }
    }
}

class Cat {
    @Override
    protected void finalize () throws Throwable {
        super.finalize ();
        System.out.println ("A Cat was destroyed");
    }
}

class Dog {
    @Override
    protected void finalize () throws Throwable {
        super.finalize ();
        System.out.println ("A Dog was destroyed");
    }
}

