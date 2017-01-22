import java.util.Arrays;

/**
 * Write a program, which uses a binary search in a sorted array of integer numbers
 * to find a certain element.
 */
public class Lab1_6_4 {
    public static void main(String[] args) {
        int[] array = {3,56,79,80,-233,45,13,76,445,17,66,53,-11};
        System.out.println("An array: " + Arrays.toString(array));

        Arrays.sort(array);
        System.out.println("Already sorted array: " + Arrays.toString(array));
        System.out.println("'76' is " + Arrays.binarySearch(array, 76) + " element");
    }
}
