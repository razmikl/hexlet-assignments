package exercise;

// BEGIN
public class Segment {
    private int beginPoint;
    private int endPoint;

    Segment(int beginPoint, int endPoint) {
        this.beginPoint = beginPoint;
        this.endPoint = endPoint;
    }

    public int getBeginPoint() {
        return this.beginPoint;
    }

    public int getEndPoint() {
        return this.endPoint;
    }

    public int getMidPoint() {
        return (getEndPoint() / getBeginPoint());
    }
}
// END
