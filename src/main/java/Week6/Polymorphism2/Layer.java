package Week6.Polymorphism2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Layer {
    private List<Shape> shapes;

    /**
     * Constructor.
     */
    public Layer() {
        this.shapes = new ArrayList<>();
    }

    /**
     * Add a shape to the layer.
     *
     * @param shape shape to be added.
     */
    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    /**
     * Remove all the circles.
     */
    public void removeCircles() {
        Iterator<Shape> iterator = shapes.iterator();
        while (iterator.hasNext()) {
            Shape shape = iterator.next();
            if (shape instanceof Circle) {
                iterator.remove();
            }
        }
    }

    /**
     * Remove all the triangles.
     */
    public void removeDuplicates() {
        int size = shapes.size();
        for (int i = 0; i < size - 1; i++) {
            Shape shape1 = shapes.get(i);
            for (int j = i + 1; j < size; j++) {
                Shape shape2 = shapes.get(j);
                if (shape1.equals(shape2)) {
                    shapes.remove(j);
                    size--;
                    j--;
                }
            }
        }
    }

    /**
     * Get information of the layer.
     *
     * @return information of the layer.
     */
    public String getInfo() {
        StringBuilder info = new StringBuilder("Layer of crazy shapes:\n");

        for (Shape shape : shapes) {
            info.append(shape.toString()).append("\n");
        }

        return info.toString();
    }
}
