import java.util.Arrays;

/**
 *
 */
public class MyMath {
    public final static double PI = 3.14;
    public static void main(String[] args) {
        int[] array = new int[] {1,4,7,8,99,0,45,6,7};
        System.out.println("Min: " + findMin(array));
        System.out.println("Max: " + findMax(array));

        System.out.println("Area of the circle is: " + areaOfCircle(15));

    }
    public static int findMin(int[] array){
        int min;
        Arrays.sort(array);
        min = array[0];
        return min;
    }

    public static int findMax(int[] array){
        int max;
        Arrays.sort(array);
        max = array[array.length-1];
        return max;
    }

    public static double areaOfCircle(int radius){
        double area = PI * radius * radius;
        return area;
    }
}
