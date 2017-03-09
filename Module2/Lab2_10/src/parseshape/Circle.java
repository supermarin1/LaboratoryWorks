package parseshape;

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
