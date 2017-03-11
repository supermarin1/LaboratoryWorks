package TestException;

/**
 *
 */
public class MyTest {
    public static void test(int i) {
        if ((i % 2) != 0) throw new MyException("value must be even");
    }
}
