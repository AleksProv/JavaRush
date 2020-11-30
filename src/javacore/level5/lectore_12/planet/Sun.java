package javacore.level5.lectore_12.planet;

public class Sun implements Planet{
    private static Sun instance = null;

    public static Sun getInstance() {
        if (instance == null) {
            synchronized (Sun.class) {
                if (instance == null) {
                    instance = new Sun();
                }
            }
        }
        return instance;
    }

    private Sun() {
    }
}