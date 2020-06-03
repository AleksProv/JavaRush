package level6.lectore_5;

/*
Ставим счетчик на котов.
 */

public class Cat3 {
    public static int catCount = 0;

    public Cat3 () {
        catCount++;
    }

    protected void finalize () throws Throwable {
        catCount--;
    }

    public static void main (String[] args) {
    }
}
