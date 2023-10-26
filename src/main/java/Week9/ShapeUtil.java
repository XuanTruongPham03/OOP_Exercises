//package Week9;

import java.util.List;

public class ShapeUtil {
    /**
     * Print the information of all the circles and triangles in the list.
     *
     * @param shapes The list of shapes.
     * @return The information of all the circles and triangles in the list.
     */
    public String printInfo(List<GeometricObject> shapes) {
        StringBuilder sb = new StringBuilder();
        sb.append("Circle:\n");
        for (GeometricObject shape : shapes) {
            if (shape instanceof Circle) {
                sb.append(shape.getInfo()).append("\n");
            }
        }
        sb.append("Triangle:\n");
        for (GeometricObject shape : shapes) {
            if (shape instanceof Triangle) {
                sb.append(shape.getInfo()).append("\n");
            }
        }
        return sb.toString();
    }
}
