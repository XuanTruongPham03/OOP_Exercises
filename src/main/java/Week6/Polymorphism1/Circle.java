package Week6.Polymorphism1;

public class Circle extends Shape {
    protected double radius;

    /**
     * Default constructor.
     */
    public Circle() {
        radius = 1.0;
    }

    /**
     * Constructor with parameter.
     *
     * @param radius radius of circle.
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Constructor with parameters.
     *
     * @param radius radius of circle.
     * @param color color of circle.
     * @param filled filled or not.
     */
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Return area of circle.
     *
     * @return area of circle.
     */
    public double getArea() {
        return radius * radius * Math.PI;
    }

    /**
     * Return perimeter of circle.
     *
     * @return perimeter of circle.
     */
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    /**
     * Return information of circle.
     *
     * @return information of circle.
     */
    public String toString() {
        return "Circle[radius=" + radius
                + ",color=" + color
                + ",filled=" + filled + "]";
    }
}
