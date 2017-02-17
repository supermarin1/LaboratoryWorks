package testShapes;

import java.util.Arrays;
/**
 *
 */
public class Main {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[0];
        double sumCircleArea = 0;
        double sumRectangleArea = 0;
        double sumTriangleArea = 0;

        shapes = addShape(shapes, new Rectangle("violet", 3, 5));
        shapes = addShape(shapes, new Rectangle("orange", 5, 7));
        shapes = addShape(shapes, new Rectangle("green", 7, 8));
        shapes = addShape(shapes, new Rectangle("black", 9, 2));
        shapes = addShape(shapes, new Rectangle("red", 1, 5));

        shapes = addShape(shapes, new Circle("red", 5.3));
        shapes = addShape(shapes, new Circle("green", 3.3));

        shapes = addShape(shapes, new Triangle("yellow", 3.3, 5.5, 6.6));
        shapes = addShape(shapes, new Triangle("white", 100, 20, 3));
        shapes = addShape(shapes, new Triangle("blue", 19, 20, 3));
        shapes = addShape(shapes, new Triangle("grey", 22, 20, 3));

        for (Shape shape : shapes) {
            System.out.println(shape.toString());
        }

        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                sumCircleArea += shape.calcArea();
            }
            if (shape instanceof Rectangle) {
                sumRectangleArea += shape.calcArea();
            }
            if (shape instanceof Triangle) {
                sumTriangleArea += shape.calcArea();
            }
        }

        System.out.println("       * * *       ");

        System.out.println("Sum of " + Circle.getCountOfCircles() + " Circle areas is:  " + sumCircleArea);
        System.out.println("Sum of " + Rectangle.getCountOfRectangles() + " Rectangle areas is:  " + sumRectangleArea);
        System.out.println("Sum of " + Triangle.getCountOfTringles() + " Triangle areas is:  " + sumTriangleArea);

    }

    private static Shape[] addShape(Shape[] shapes, Shape newShape) {
        Shape[] newArrayOfShapes = Arrays.copyOf(shapes, shapes.length + 1);
        newArrayOfShapes[newArrayOfShapes.length - 1] = newShape;
        return newArrayOfShapes;
    }
}
