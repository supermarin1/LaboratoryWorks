import java.util.Arrays;

/**
 *Writing simple console application, using array and loop.
 */
public class Lab1_6_1 {
    public static void main(String[] args) {
        int[] array = new int[15];

        for (int i = 0; i < 15; i++) {
                array [i] = 2*(i+1);
        }
        System.out.println(Arrays.toString(array));
    }
}
