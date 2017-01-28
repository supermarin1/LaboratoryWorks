/**
 *
 */
public class Lab2_2_2 {
    public static void main(String[] args) {
        Matrix instMatrix = new Matrix();

        int[][] matrix1 = {{1, 2}, {4, 5}};
        int[][] matrix2 = {{7, 8}, {10, 11}};

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
        instMatrix.sumOfMatrix(matrix1,matrix2);

        System.out.println("The result of multiplication of matrices: ");
        instMatrix.multOfMatrix(matrix1,matrix2);
    }
}
