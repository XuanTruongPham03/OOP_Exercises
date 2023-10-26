//package Week9;

public class Point {
    private double pointX;
    private double pointY;

    public Point(double pointX, double pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    public double getPointX() {
        return pointX;
    }

    public double getPointY() {
        return pointY;
    }

    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

    /**
     * Calculate the distance between this point and another point.
     *
     * @param other The other point.
     * @return The distance between this point and another point.
     */
    public double distance(Point other) {
        return Math.sqrt(
                Math.pow(pointX - other.pointX, 2)
                + Math.pow(pointY - other.pointY, 2)
                );
    }
}
