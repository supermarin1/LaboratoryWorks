package parseshape2;

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
            shapesArray[i] = Shape.parseShape(sc.next());
        }

        sc.close();

        for (Shape shape : shapesArray) {
            System.out.println(shape.toString());
        }
    }
}
