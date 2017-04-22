package varargs;

import java.util.Arrays;

/**
 *
 */
public class OverloadVarargs {
    public static void main(String[] args) {

        foo(2,4);
        foo(2,4,6);

    }
    static void foo (int a, int b){
        System.out.println("a: " + a + ", b: " + b);
    }

    static void foo (int... a){
        System.out.println(Arrays.toString(a));
    }
}
