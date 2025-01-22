package exercise;

// BEGIN
public class Segment {
    private Point beginPoint;
    private Point endPoint;

    Segment(Point beginPoint, Point endPoint) {
        this.beginPoint = beginPoint;
        this.endPoint = endPoint;
    }

    public Point getBeginPoint() {
        return this.beginPoint;
    }

    public Point getEndPoint() {
        return this.endPoint;
    }

    public Segment getMidPoint() {
        int midPointX = ((this.beginPoint.getX() + this.endPoint.getX()) /2);
        int midPointY = ((this.beginPoint.getY() + this.endPoint.getY()) / 2);
        Segment midPoint = new Point(midPointX, midPointY);
        return midPoint;
    }
}
// END
