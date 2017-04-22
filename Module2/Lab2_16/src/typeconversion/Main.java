package typeconversion;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        byte b = 12;
        foo(b);
    }

    static void foo(int i) {
        System.out.println("int");
    }

    static void foo(Byte b) {
        System.out.println("Byte");
    }
}
