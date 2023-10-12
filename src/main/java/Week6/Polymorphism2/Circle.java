package Week6.Polymorphism2;

public class Circle extends Shape {
    protected Point center;
    protected double radius;

    /**
     * Constructor.
     */
    public Circle() {
        super();
        this.center = new Point(0.0, 0.0);
        this.radius = 1.0;
    }

    /**
     * Constructor.
     *
     * @param radius radius of the circle.
     * @param color color of the circle.
     * @param filled filled or not.
     */
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.center = new Point(0.0, 0.0);
        this.radius = radius;
    }

    /**
     * Constructor.
     * @param radius radius of the circle.
     */
    public Circle(double radius) {
        super();
        this.center = new Point(0.0, 0.0);
        this.radius = radius;
    }

    /**
     * Constructor.
     * @param center center of the circle.
     * @param radius radius of the circle.
     * @param color color of the circle.
     * @param filled filled or not.
     */
    public Circle(Point center, double radius, String color, boolean filled) {
        super(color, filled);
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return this.center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public String toString() {
        return "Circle[center=" + this.center
                + ",radius=" + this.radius
                + ",color=" + this.color
                + ",filled=" + this.filled + "]";
    }

    /**
     * Check if two circles are equal.
     * @param o other circle.
     * @return true if two circles are equal, false otherwise.
     */
    public boolean equals(Object o) {
        if (o instanceof Circle) {
            Circle other = (Circle) o;
            return this.center.equals(other.center)
                    && this.radius == other.radius;
        }
        return false;
    }

    /**
     * Hashcode.
     *
     * @return hashcode of the circle.
     */
    public int hashcode() {
        return (int) (this.center.hashcode() + this.radius) / 2;
    }
}
