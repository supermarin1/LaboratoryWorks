/**
 * Write a program, which transpose matrix (2d arrays, size 4x4)
 * and outputs it to the console
 */
public class Lab1_6_5 {
    public static void main(String[] args) {
        int[][] array = {{11, 22, 33, 44}, {55, 66, 77, 88},
                {31, 32, 33, 34}, {35, 36, 37, 38}};
        System.out.println("Original matrix: ");
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Transposed matrix: ");
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = array[i].length - 1; j >= 0; j--) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
