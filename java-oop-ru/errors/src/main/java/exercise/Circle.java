package exercise;

// BEGIN
public class Circle {
    private Point point;
    private int radius;

    public Circle(Point point, int radius) {
        this.point = point;
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public double getSquare() throws NegativeRadiusException {
        double result = this.radius * this.radius * Math.PI;

        if (result < 0) {
            throw new NegativeRadiusException("Площадь круга меньше 0");
        } else {
            return result;
        }
    }
}
// END
