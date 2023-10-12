package Week6.Polymorphism2;

public class Point {
    private double pointX;
    private double pointY;

    /**
     * Constructor.
     */
    public Point(double pointX, double pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    public double getPointX() {
        return pointX;
    }

    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    public double getPointY() {
        return pointY;
    }

    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

    /**
     * Calculate the distance between two points.
     * @param newPoint the new point.
     * @return the distance between two points.
     */
    public double distance(Point newPoint) {
        return Math.sqrt(Math.pow(newPoint.getPointX() - this.pointX, 2)
                + Math.pow(newPoint.getPointY() - this.pointY, 2));
    }

    /**
     * Check if two points are equal.
     * @param o other point.
     * @return true if two points are equal, false otherwise.
     */
    public boolean equals(Object o) {
        if (o instanceof Point) {
            Point newPoint = (Point) o;
            return this.pointX == newPoint.getPointX()
                    && this.pointY == newPoint.getPointY();
        }
        return false;
    }

    /**
     * Hashcode.
     *
     * @return hashcode of the point.
     */
    public int hashcode() {
        return (int) (this.pointX + this.pointY) / 2;
    }

    @Override
    public String toString() {
        return "(" + this.pointX + "," + this.pointY + ")";
    }
}
