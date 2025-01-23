package exercise;

// BEGIN
public class Cottage implements Home {
    private double area;
    private int floorCount;

    public Cottage (double area, int floorCount) {
        this.area = area;
        this.floorCount = floorCount;
    }

    public int getArea() {
        return this.area + this.floorCount;
    }

    public int compareTo(Home another) {
        if (another.getArea() < this.getArea()) {
            return 1;
        } else if (another.getArea() > this.getArea()) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "2 этажный коттедж площадью " + getArea() + " метров";
    }
}
// END
