package level6.lectore_8;

/*
Расстояние между двумя точками
 */

public class Util {

    public static double getDistance (int x1, int x2, int y1, int y2) {
        return Math.sqrt ((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }

    public static void main (String[] args) {
    }
}