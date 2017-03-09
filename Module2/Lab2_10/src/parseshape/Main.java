package parseshape;

/**
 *
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("   *** Lab2_10 ***   ");
        Shape shape1 = Shape.parseShape("Circle:RED:2.5");
        Shape shape2 = Shape.parseShape("Triangle:GREEN:2.5,3.5,5");
        Shape shape3 = Shape.parseShape("Rectangle:RED:2.5,8");
        System.out.println(shape1.toString());
        System.out.println(shape2.toString());
        System.out.println(shape3.toString());

    }
}
