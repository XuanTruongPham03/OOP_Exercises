package Week6.Polymorphism1;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    /**
     * Default constructor.
     */
    public Rectangle() {
        width = 1.0;
        length = 1.0;
    }

    /**
     * Constructor with parameters.
     *
     * @param width width of rectangle.
     * @param length length of rectangle.
     */
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    /**
     * Constructor with parameters.
     *
     * @param width width of rectangle.
     * @param length length of rectangle.
     * @param color color of rectangle.
     * @param filled filled or not.
     */
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    /**
     * Return area of rectangle.
     *
     * @return area of rectangle.
     */
    public double getArea() {
        return width * length;
    }

    /**
     * Return perimeter of rectangle.
     *
     * @return perimeter of rectangle.
     */
    public double getPerimeter() {
        return 2 * (width + length);
    }

    /**
     * Return information of rectangle.
     *
     * @return information of rectangle.
     */
    public String toString() {
        return "Rectangle[width=" + width
                + ",length=" + length
                + ",color=" + color
                + ",filled=" + filled + "]";
    }
}