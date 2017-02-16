package testShapes;

/**
 *
 */
public class Shape {
    private String shapeColor;
    private static int countOfShapes = 0;

    public Shape(String color) {
        this.shapeColor = color;
        countOfShapes++;
    }

    public double calcArea() {
        double area = 0.0;
        return area;
    }

    @Override
    public String toString() {
        return "This is " + getClass().getSimpleName() + ", color is: " + shapeColor.toUpperCase();
    }

    public static int getCountOfShapes() {
        return countOfShapes;
    }

    public void setShapeColor(String shapeColor) {
        this.shapeColor = shapeColor;
    }
}
