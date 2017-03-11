package MyShapesException;

import java.util.StringTokenizer;

/**
 *
 */
public class Rectangle extends Shape implements Comparable<Rectangle> {
    private double width;
    private double height;
    private static int countOfRectangles = 0;

    public Rectangle(String color, double width, double height) {
        super(color);
        countOfRectangles++;
        this.width = width;
        this.height = height;
    }

    public static Rectangle parseRectangle(String s) {
        StringTokenizer st = new StringTokenizer(s, ":,");
        String type = st.nextToken();
        Rectangle rectangle = new Rectangle(st.nextToken(), Double.parseDouble(st.nextToken()),
                Double.parseDouble(st.nextToken()));
        return rectangle;
    }

    @Override
    public double calcArea() {
        return (width * height);
    }

    @Override
    public String toString() {
        return super.toString() + ", width - " + width + ", heigth - " + height;
    }

    public static int getCountOfRectangles() {
        return countOfRectangles;
    }

    @Override
    public int compareTo(Rectangle o) {
        int result = 0;
        if (this.calcArea() > o.calcArea()) {
            result = 1;
        } else if (this.calcArea() == o.calcArea()) {
            result = 0;
        } else if (this.calcArea() < o.calcArea()) {
            result = -1;
        }
        return result;
    }
}
