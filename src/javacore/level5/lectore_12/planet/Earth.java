package javacore.level5.lectore_12.planet;

public class Earth implements Planet {

    private static Earth instance = null;

    public static Earth getInstance() {
        if (instance == null) {
            synchronized (Earth.class) {
                if (instance == null) {
                    instance = new Earth();
                }
            }
        }
        return instance;
    }

    private Earth() {
    }
}