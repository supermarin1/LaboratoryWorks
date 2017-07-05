package testannotation1;

import java.util.Arrays;

public class MainAnn {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {

        System.out.println(findMax(2, 4, 6, 9, -10, 45, 67, 8, 2));
    }
    @Deprecated
    @SafeVarargs
    private static <T> T findMax(T... number) {
        Arrays.sort(number);
        return number[number.length - 1];
    }
}
