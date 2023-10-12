package Week6.Polymorphism1;

public abstract class Shape {
    protected String color;
    protected boolean filled;

    /**
     * Default constructor.
     */
    public Shape() {
        color = "null";
        filled = false;
    }

    /**
     * Constructor with parameters.
     *
     * @param color color of shape.
     * @param filled filled or not.
     */
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    /**
     * Return information of shape.
     *
     * @return information of shape.
     */
    public String toString() {
        return "Shape[color=" + color + ", filled=" + filled + "]";
    }
}
