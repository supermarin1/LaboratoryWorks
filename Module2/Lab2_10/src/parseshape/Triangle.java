package parseshape;

/**
 *
 */
public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;
    private static int countOfTringles = 0;
    private boolean isValid = true;

    public Triangle(String color, double a, double b, double c) {
        super(color);
        if (((a + b) <= c) || ((a + c) <= b) || ((b + c) <= a)) {
            System.out.println("ATTENTION!!! Invalid input. Shape number " + getCountOfShapes() + "\n");
            setShapeColor("no color");
            isValid = false;
        } else {
            countOfTringles++;
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }

    @Override
    public double calcArea() {
        if (isValid) {
            double s = (a + b + c) / 2;
            return (Math.sqrt(s * (s - a) * (s - b) * (s - c)));
        } else {
            return 0.0;
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", a = " + a + ", b = " + b + ", c = " + c;
    }

    public static int getCountOfTringles() {
        return countOfTringles;
    }
}
