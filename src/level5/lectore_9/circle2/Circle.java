package level5.lectore_9.circle2;

/*
Максимум конструкторов.
 */

public class Circle {
   public double x;
   public double y;
   public double radius;

    public Circle (double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle (double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Circle (double radius) {
       this.radius = radius;
    }

    public Circle () {
       }

    public static void main (String[] args) {
    }
}
