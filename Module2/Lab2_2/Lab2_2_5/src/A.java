/**
 *
 */
public class A {
    static int calcSquare (int sideA, int sideB){
        System.out.println("The square of rectangle is: " + (sideA*sideB));
        return (sideA*sideB);
    }

    static int calcSquare (int squareSide){
        System.out.println("The square of foursquare is: " + (squareSide*squareSide));
        return (squareSide*squareSide);
    }

    static double calcSquare (double radius) {
        System.out.println("The square of circle is: " + (3.14 * radius * radius));
        return (3.14 * radius * radius);
    }
}
