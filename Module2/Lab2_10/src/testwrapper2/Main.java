package testwrapper2;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        Byte a = 14;
        Integer b = 234234;

        System.out.println(compute(a, b));
    }

    private static Long compute(Byte num1, Integer num2) {
        Long sum = Long.valueOf(num1 + num2);
        return sum;
    }
}
