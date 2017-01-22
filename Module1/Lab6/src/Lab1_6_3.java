/**
 * Writing simple console application, using 2-dimensional arrays.
 */
public class Lab1_6_3 {
    public static void main(String[] args) {
        int [][] array = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                array [i][j] = i + j*4 + 1;
            }
        }

        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
