package testShapes;

/**
 *
 */
public abstract class Shape implements Drawable {
    public String getShapeColor() {
        return shapeColor;
    }

    private String shapeColor;
    private static int countOfShapes = 0;

    public Shape(String color) {
        this.shapeColor = color;
        countOfShapes++;
    }

    public abstract double calcArea();

    @Override
    public void draw() {
        System.out.print(toString() + ", area is: ");
        System.out.format("%.2f%n", calcArea());
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
