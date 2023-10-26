//package Week9;

public class Triangle implements GeometricObject {
    private Point p1;
    private Point p2;
    private Point p3;

    /**
     * Constructor.
     *
     * @param p1 First point.
     * @param p2 Second point.
     * @param p3 Third point.
     * @throws RuntimeException If the triangle is invalid.
     */
    public Triangle(Point p1, Point p2, Point p3) throws RuntimeException {
        if (p1.distance(p2) + p2.distance(p3) <= p3.distance(p1)
                || p2.distance(p3) + p3.distance(p1) <= p1.distance(p2)
                || p3.distance(p1) + p1.distance(p2) <= p2.distance(p3)
                || p1.distance(p2) == 0
                || p2.distance(p3) == 0
                || p3.distance(p1) == 0
                || (p1.getPointX() - p3.getPointX()) * (p2.getPointY() - p3.getPointY())
                == (p2.getPointX() - p3.getPointX()) * (p1.getPointY() - p3.getPointY())
                ) {
            throw new RuntimeException("Invalid triangle");
        }
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public Point getP3() {
        return p3;
    }

    @Override
    public double getPerimeter() {
        return p1.distance(p2) + p2.distance(p3) + p3.distance(p1);
    }

    @Override
    public double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - p1.distance(p2)) * (s - p2.distance(p3)) * (s - p3.distance(p1)));
    }

    @Override
    public String getInfo() {
        return "Triangle[("
                + String.format("%.2f", p1.getPointX())
                + "," + String.format("%.2f", p1.getPointY())
                + "),("
                + String.format("%.2f", p2.getPointX())
                + "," + String.format("%.2f", p2.getPointY())
                + "),("
                + String.format("%.2f", p3.getPointX())
                + "," + String.format("%.2f", p3.getPointY())
                + ")]";
    }
}