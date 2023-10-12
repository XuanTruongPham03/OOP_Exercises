package Week6.Polymorphism1;

public class Square extends Rectangle {
    /**
     * Default constructor.
     */
    public Square() {
        width = 1.0;
        length = 1.0;
    }

    /**
     * Constructor with parameter.
     *
     * @param side side of square.
     */
    public Square(double side) {
        width = side;
        length = side;
    }

    /**
     * Constructor with parameters.
     *
     * @param side side of square.
     * @param color color of square.
     * @param filled filled or not.
     */
    public Square(double side, String color, boolean filled) {
        super(side, side);
        this.color = color;
        this.filled = filled;
    }

    public double getSide() {
        return width;
    }

    public void setSide(double side) {
        width = side;
        length = side;
    }

    public void setWidth(double side) {
        width = side;
        length = side;
    }

    public void setLength(double side) {
        width = side;
        length = side;
    }

    /**
     * Return information of square.
     *
     * @return information of square.
     */
    public String toString() {
        return "Square[side=" + width
                + ",color=" + color
                + ",filled=" + filled + "]";
    }
}
