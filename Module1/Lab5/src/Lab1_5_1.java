/**
 * Writing simple console application, using standard output and nested loop
 */
public class Lab1_5_1 {
    public static void main(String[] args) {
        for (int i = 1; i < 9; i++) {
            for (int j = i; j >= 1; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
