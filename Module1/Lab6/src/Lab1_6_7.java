/**
 * Writing simple console application, using 2d arrays.
 */
public class Lab1_6_7 {
    public static void main(String[] args) {
        int[][] newArray = {{1,1,1,3,4}, {2,1,3,1,2}, {2,2,3,4,1},{3,3,3,1,4}};
        for (int[] ints : newArray) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < newArray.length; i++) {
            System.out.print("Line" + (i+1) + ": [ ");
            for (int j = 0; j <= newArray.length; j++) {
                if (newArray[i][j] == 1){
                    System.out.print(j + " ");
                }
            }
            System.out.println("]");
        }
    }
}
