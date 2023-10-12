package Week6.Polymorphism2;

public class Square extends Rectangle {
    /**
     * Constructor.
     */
    public Square() {
        super();
    }

    /**
     * Constructor.
     *
     * @param side side of the square.
     */
    public Square(double side) {
        super(side, side, "null", false);
    }

    /**
     * Constructor.
     *
     * @param side side of the square.
     * @param color color of the square.
     * @param filled filled or not.
     */
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    /**
     * Constructor.
     *
     * @param topLeft top left point of the square.
     * @param side side of the square.
     * @param color color of the square.
     * @param filled filled or not.
     */
    public Square(Point topLeft, double side, String color, boolean filled) {
        super(topLeft, side, side, color, filled);
    }

    public double getSide() {
        return this.width;
    }

    public void setSide(double side) {
        this.width = side;
        this.length = side;
    }

    public void setWidth(double side) {
        this.width = side;
    }

    public void setLength(double side) {
        this.length = side;
    }

    @Override
    public String toString() {
        return "Square[topLeft=" + this.topLeft.toString()
                + ",side=" + this.width
                + ",color=" + this.color
                + ",filled=" + this.filled + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Square) {
            Square newSquare = (Square) o;
            return this.topLeft.equals(newSquare.getTopLeft())
                    && this.width == newSquare.getWidth()
                    && this.length == newSquare.getLength();
        }
        return false;
    }

    /**
     * Hashcode.
     *
     * @return hashcode of the square.
     */
    public int hashCode() {
        return (int) (this.topLeft.hashCode() + this.width + this.length) / 3;
    }
}
