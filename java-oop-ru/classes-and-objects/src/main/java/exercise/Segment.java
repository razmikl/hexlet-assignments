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

    public Point getMidPoint() {
        int pointX = ((this.beginPoint.getX() + this.endPoint.getX()) / 2);
        int pointY = ((this.beginPoint.getY() + this.endPoint.getY()) / 2);
        Point result = new Point(pointX, pointY);
        return result;
    }
}
// END
