import java.util.Arrays;
import java.util.Random;
/**
 *
 */
public class Calculation {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array1 = new int[10];
        int[] array2 = new int[20];

        for (int i=0; i < array1.length-1; i++){
            array1[i] = random.nextInt();
        }

        for (int i=0; i < array2.length-1; i++){
            array2[i] = random.nextInt();
        }

        System.out.println("The first array is: " + Arrays.toString(array1));
        System.out.println("Min: " + MyMath.findMin(array1) + ", Max: " + MyMath.findMax(array1));
        System.out.println();
        System.out.println("The second array is: " + Arrays.toString(array1));
        System.out.println("Min: " + MyMath.findMin(array2) + ", Max: " + MyMath.findMax(array2));
    }
}
