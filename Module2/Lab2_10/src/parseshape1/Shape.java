package parseshape1;

import java.util.StringTokenizer;

import static parseshape1.Circle.parseCircle;
import static parseshape1.Rectangle.parseRectangle;
import static parseshape1.Triangle.parseTriangle;

/**
 *
 */
public abstract class Shape implements Drawable {
    String getShapeColor() {
        return shapeColor;
    }

    private String shapeColor;
    private static int countOfShapes = 0;

    Shape(String color) {
        this.shapeColor = color;
        countOfShapes++;
    }

    public abstract double calcArea();

    public static Shape parseShape(String s) {
        Shape shape = new Circle("NO COLOR", 0);

        StringTokenizer st = new StringTokenizer(s, ":,");

        switch (st.nextToken()) {
            case "Rectangle":
                shape = parseRectangle(s);
                break;
            case "Triangle":
                shape = parseTriangle(s);
                break;
            case "Circle":
                shape = parseCircle(s);
                break;
        }
        return shape;
    }

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
