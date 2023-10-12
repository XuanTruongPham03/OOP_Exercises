package Week6.Polymorphism2;

public class Rectangle extends Shape {
    protected Point topLeft;
    protected double width;
    protected double length;

    /**
     * Constructor.
     */
    public Rectangle() {
        super();
        this.topLeft = new Point(0.0, 0.0);
        this.width = 1.0;
        this.length = 1.0;
    }

    /**
     * Constructor.
     *
     * @param width width of the rectangle.
     * @param length length of the rectangle.
     * @param color color of the rectangle.
     * @param filled filled or not.
     */
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.topLeft = new Point(0.0, 0.0);
        this.width = width;
        this.length = length;
    }

    /**
     * Constructor.
     *
     * @param topLeft top left point of the rectangle.
     * @param width width of the rectangle.
     * @param length length of the rectangle.
     * @param color color of the rectangle.
     * @param filled filled or not.
     */
    public Rectangle(Point topLeft, double width, double length, String color, boolean filled) {
        super(color, filled);
        this.topLeft = topLeft;
        this.width = width;
        this.length = length;
    }

    /**
     * Constructor.
     *
     * @param width width of the rectangle.
     * @param length length of the rectangle.
     */
    public Rectangle(double width, double length) {
        super();
        this.topLeft = new Point(0.0, 0.0);
        this.width = width;
        this.length = length;
    }

    public Point getTopLeft() {
        return this.topLeft;
    }

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return this.length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return this.width * this.length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (this.width + this.length);
    }

    @Override
    public String toString() {
        return "Rectangle[topLeft=" + this.topLeft
                + ",width=" + this.width
                + ",length=" + this.length
                + ",color=" + this.color
                + ",filled=" + this.filled + "]";
    }

    /**
     * Check if two rectangles are equal.
     *
     * @param o other rectangle.
     * @return true if two rectangles are equal, false otherwise.
     */
    public boolean equals(Object o) {
        if (o instanceof Rectangle) {
            Rectangle newRectangle = (Rectangle) o;
            return this.topLeft.equals(newRectangle.getTopLeft())
                    && this.width == newRectangle.getWidth()
                    && this.length == newRectangle.getLength();
        }
        return false;
    }

    /**
     * Hashcode.
     *
     * @return hashcode of the rectangle.
     */
    public int hashcode() {
        return (int) (this.topLeft.hashcode() + this.width + this.length) / 3;
    }
}
