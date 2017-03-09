package parseshape1;

import java.util.StringTokenizer;

/**
 *
 */
public class Circle extends Shape {
    private double raduis;
    private static int countOfCircles = 0;

    public Circle(String color, double raduis) {
        super(color);
        countOfCircles++;
        this.raduis = raduis;
    }

    public static Circle parseCircle(String s) {
        StringTokenizer st = new StringTokenizer(s, ":,");
        String type = st.nextToken();
        Circle circle = new Circle(st.nextToken(), Double.parseDouble(st.nextToken()));
        return circle;
    }

    @Override
    public double calcArea() {
        return (raduis * Math.PI);
    }

    @Override
    public String toString() {
        return super.toString() + ", radius is: " + raduis;
    }

    public static int getCountOfCircles() {
        return countOfCircles;
    }
}
