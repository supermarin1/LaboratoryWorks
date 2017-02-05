/**
 * Create class MyInit with field arr of array of integers
 * and non-static initialization block which will initialize
 * that array with random values (Size of array is 10).
 * Add to class MyInit and method printArray() which will print values of this array.
 * Create class Main, which will create two instances of class MyInit
 * and invoke method printArray() to print values of their arrays on console.
 */
public class Lab2_5_2 {
    public static void main(String[] args) {
        MyInt arr1 = new MyInt();
        MyInt arr2 = new MyInt();

        arr1.printArray();
        arr2.printArray();

    }

    static class MyInt {
        int[] arr = new int[10];

        {
            for (int i = 0; i < arr.length - 1; i++) {
                arr[i] = (int) (100 * Math.random());
            }
        }

        private void printArray() {
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
