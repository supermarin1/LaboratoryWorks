/**
 *
 */
public class Lab2_2_1 {
    public static void main(String[] args) {

        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix2 = {{7, 8, 9}, {10, 11, 12}, {13, 14, 15}};

        System.out.println("The first matrix: ");
        for (int[] ints : matrix1) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }

        System.out.println("The second matrix: ");
        for (int[] ints : matrix2) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }

        System.out.println("The sum of matrices: ");
        Matrix.sumOfMatrix(matrix1, matrix2);

        System.out.println("The result of multiplication of matrices: ");
        Matrix.multOfMatrix(matrix1, matrix2);
    }
}
