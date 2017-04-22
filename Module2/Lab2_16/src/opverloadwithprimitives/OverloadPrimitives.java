package opverloadwithprimitives;

/**
 *
 */
public class OverloadPrimitives {
    public static void main(String[] args) {

        byte b = 5;

        foo(b);
        foo(5);

    }

    static void foo(int i) {
        System.out.println("int");
    }

    static void foo(byte b) {
        System.out.println("byte");
    }
}
