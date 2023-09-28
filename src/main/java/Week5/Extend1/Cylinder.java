package Week5.Extend1;

public class Cylinder extends Circle {
    private double height;

    /**
     * Constructor.
     */
    public Cylinder() {
        super();
        this.height = 1.0;
    }

    /**
     * Constructor with radius.
     * 
     * @param radius the radius of the cylinder.
     */
    public Cylinder(double radius) {
        super(radius);
        this.height = 1.0;
    }

    /**
     * Constructor with radius and height.
     * 
     * @param radius the radius of the cylinder.
     * @param height the height of the cylinder.
     */
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    /**
     * Constructor with radius, height and color.
     * 
     * @param radius the radius of the cylinder.
     * @param height the height of the cylinder.
     * @param color  the color of the cylinder.
     */
    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    /**
     * Get the height.
     * 
     * @return the height of the cylinder.
     */
    public double getHeight() {
        return this.height;
    }

    /**
     * Set the height.
     * 
     * @param height the height of the cylinder.
     */
    public void setHeight(double height) {
        this.height = height;
        return;
    }

    /**
     * Get the volume.
     * 
     * @return the volume of the cylinder.
     */
    public double getVolume() {
        return super.getArea() * this.height;
    }

    @Override
    public String toString() {
        return "Cylinder: [" + super.toString() + " height=" + this.height + "]";
    }

    @Override
    public double getArea() {
        return 2 * PI * this.getRadius() * this.height + 2 * super.getArea();
    }
}
