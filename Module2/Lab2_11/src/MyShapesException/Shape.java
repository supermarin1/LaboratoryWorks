package MyShapesException;

import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static MyShapesException.Circle.parseCircle;
import static MyShapesException.Rectangle.parseRectangle;
import static MyShapesException.Triangle.parseTriangle;

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

    static Shape parseShape(String s) throws InvalidShapeStringException {
        Shape shape = new Circle("NO COLOR", 0);

        String SHAPE_STRING_PATTERN = "(rectangle|triangle|circle):\\w{3,}:(\\d+,?)+";
        Pattern pt = Pattern.compile(SHAPE_STRING_PATTERN, Pattern.CASE_INSENSITIVE);
        Matcher mt = pt.matcher(s);

        if (mt.matches()) {
            StringTokenizer st = new StringTokenizer(s, ":,");
            switch (st.nextToken().toLowerCase()) {
                case "rectangle":
                    shape = parseRectangle(s);
                    break;
                case "triangle":
                    shape = parseTriangle(s);
                    break;
                case "circle":
                    shape = parseCircle(s);
                    break;
            }
        } else {
            throw new InvalidShapeStringException("Can't resolve the shape");
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
