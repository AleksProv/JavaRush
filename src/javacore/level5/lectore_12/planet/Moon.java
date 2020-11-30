package javacore.level5.lectore_12.planet;

public class Moon implements Planet {
    private static Moon instance = null;

    public static Moon getInstance() {
        if (instance == null) {
            synchronized (Moon.class) {
                if (instance == null) {
                    instance = new Moon();
                }
            }
        }
        return instance;
    }

    private Moon() {
    }
}