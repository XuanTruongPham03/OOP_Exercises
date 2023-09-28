package Week5.Extend1;

public class Circle {
    private double radius;
    private String color;
    protected static final double PI = 3.14;

    /**
     * Constructor.
     */
    public Circle() {
        this.radius = 1.0;
        this.color = "white";
    }

    /**
     * Constructor with radius.
     */
    public Circle(double radius) {
        this.radius = radius;
        this.color = "white";
    }

    /**
     * Constructor with radius and color.
     */
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    /**
     * Get the radius.
     */
    public double getRadius() {
        return this.radius;
    }

    /**
     * Get the color.
     */
    public String getColor() {
        return this.color;
    }

    /**
     * Set the radius.
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Set the color.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Get the area.
     */
    public double getArea() {
        return PI * this.radius * this.radius;
    }

    /**
     * Get the circumference.
     */
    public String toString() {
        return "Circle[radius=" + this.radius + ",color=" + this.color + "]";
    }
}
