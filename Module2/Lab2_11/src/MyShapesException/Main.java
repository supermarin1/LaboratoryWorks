package MyShapesException;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 */
public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int size = Integer.parseInt(sc.next());

        Shape[] shapesArray = new Shape[size];

        for (int i = 0; i < shapesArray.length; i++) {
            try {
                shapesArray[i] = Shape.parseShape(sc.next());
            } catch (InvalidShapeStringException e) {
                shapesArray = Arrays.copyOf(shapesArray, shapesArray.length-1);
                System.out.println(e.getMessage());
            }
            finally {
                System.out.println("this shape is checked");
            }
        }

        sc.close();

        for (Shape shape : shapesArray) {
            System.out.println(shape.toString());
        }
    }
}
