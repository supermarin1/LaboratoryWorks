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

        System.out.println();

        System.out.println("Sum of " + Circle.getCountOfCircles() + " Circle areas is:  " + sumCircleArea);
        System.out.println("Sum of " + Rectangle.getCountOfRectangles() + " Rectangle areas is:  " + sumRectangleArea);
        System.out.println("Sum of " + Triangle.getCountOfTringles() + " Triangle areas is:  " + sumTriangleArea);


        System.out.println("   *** Lab2_8 ***   ");
        Shape[] rectangles = new Rectangle[0];

        Shape rectangle1 = new Rectangle("violet", 3, 5);
        Shape rectangle2 = new Rectangle("yellow", 5, 6);
        Shape rectangle3 = new Rectangle("green", 5, 8);
        Shape rectangle4 = new Rectangle("blue", 10, 6);
        Shape rectangle5 = new Rectangle("black", 5, 16);
        Shape rectangle6 = new Rectangle("red", 15, 6);

        System.out.println("Implementing method draw() Drawable interface: ");
        for (Shape shape : shapes) {
            shape.draw();
        }

        rectangles = addRectangle(rectangles, rectangle1);
        rectangles = addRectangle(rectangles, rectangle2);
        rectangles = addRectangle(rectangles, rectangle3);
        rectangles = addRectangle(rectangles, rectangle4);
        rectangles = addRectangle(rectangles, rectangle5);
        rectangles = addRectangle(rectangles, rectangle6);

        Shape triangle1 = new Triangle("yellow", 3.3, 5.5, 6.6);

        System.out.println("Comparing rectangles: ");
        compareRectangles(rectangle1, rectangle2);
        compareRectangles(rectangle1, triangle1);

        System.out.println("Sorting Rectangles by area: ");

        Arrays.sort(rectangles);
        for (Shape item : rectangles) {
            item.draw();
        }

        System.out.println("Sorting rectangles by color: ");

        Arrays.sort(rectangles, new ShapeColorComparator());
        for (Shape item : rectangles) {
            item.draw();
        }
    }

    private static void compareRectangles(Shape a, Shape b) {
        if ((a instanceof Rectangle) && (b instanceof Rectangle)) {

            Rectangle rect1 = (Rectangle) a;
            Rectangle rect2 = (Rectangle) b;

            switch (rect1.compareTo(rect2)) {
                case 1:
                    System.out.println("The first is bigger");
                    break;
                case 0:
                    System.out.println("They are equal");
                    break;
                case -1:
                    System.out.println("The first is smaller");
                    break;
            }
            System.out.println("Different shapes");
        }
    }

    private static Shape[] addShape(Shape[] shapes, Shape newShape) {
        Shape[] newArrayOfShapes = Arrays.copyOf(shapes, shapes.length + 1);
        newArrayOfShapes[newArrayOfShapes.length - 1] = newShape;
        return newArrayOfShapes;
    }


    private static Shape[] addRectangle(Shape[] shapes, Shape newShape) {
        Shape[] newArrayOfShapes = Arrays.copyOf(shapes, shapes.length + 1);
        newArrayOfShapes[newArrayOfShapes.length - 1] = newShape;
        return newArrayOfShapes;
    }
}
