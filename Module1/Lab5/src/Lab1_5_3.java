/**
 * Using loops.
 */
public class Lab1_5_3 {
    public static void main(String[] args) {
        System.out.print("*" + " | ");
        for (int i = -1; i <10; i++) {
            if (i>0) System.out.print(i + " | ");
            for (int j = 1; j < 10; j++) {
                if (i==-1) {
                    System.out.print(j + "\t");
                }else if (i==0) {
                        System.out.print("----");
                    } else
                System.out.print((i*j) + "\t");
            }
            System.out.println();
        }
    }
}
