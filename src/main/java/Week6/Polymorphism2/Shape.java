package Week6.Polymorphism2;

public abstract class Shape {
    protected String color;
    protected boolean filled;

    /**
     * Default constructor.
     */
    public Shape() {
        this.color = "null";
        this.filled = false;
    }

    /**
     * Constructor with parameters.
     * @param color color of the shape.
     * @param filled filled or not.
     */
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return this.filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "Shape[color=" + this.color
                + ",filled=" + this.filled + "]";
    }
}
