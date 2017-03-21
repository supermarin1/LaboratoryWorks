package testgenerics2;

/**
 *
 */
public class Main {
    public static void main(String[] args) {

        Integer[] intArray = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        Double[] doubleArray = new Double[]{1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9};

        System.out.println(MyTestMethod.calcNum(intArray, 3));
        System.out.println(MyTestMethod.calcNum(doubleArray, 3.0));

        System.out.println(MyTestMethod.calcSum(intArray, 3));
        System.out.println(MyTestMethod.calcSum(doubleArray, 3.0));


    }
}
