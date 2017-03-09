package testwrapper;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        Integer x1 = 67;
        Integer x2 = new Integer(67);
        Integer x3 = new Integer("67");
        Integer x4 = Integer.valueOf(67);
        Integer x5 = Integer.parseInt("6");

        System.out.println("    ==: ");
        System.out.println((x1 == x2));
        System.out.println((x1 == x3));
        System.out.println((x1 == x4));
        System.out.println((x1 == x5));
        System.out.println((x1 == x5));

        System.out.println("    equals: ");
        System.out.println(x1.equals(x2));
        System.out.println(x1.equals(x3));
        System.out.println(x1.equals(x4));
        System.out.println(x1.equals(x5));
        System.out.println(x1.equals(x2));

    }
}
