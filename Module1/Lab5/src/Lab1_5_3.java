/**
 * Using loops.
 */
public class Lab1_5_3 {
    public static void main(String[] args) {
        System.out.println("*" + "\t" + 1 +"\t" + 2  +"\t" + 3 +"\t" + 4 +"\t" +
            5 +"\t" + 6 +"\t" + 7 +"\t" + 8 +"\t" + 9);
        System.out.println(" ------------------------------------------------");

        for (int i = 1; i < 10; i++) {
            System.out.print(i + " | ");
            for (int j=1; j<10; j++){
                System.out.println((i*j) + "\t");
            }
            System.out.println();
        }

//        System.out.print("*" + " | ");
//        for (int i = -1; i <10; i++) {
//            if (i>0) System.out.print(i + " | ");
//            for (int j = 1; j < 10; j++) {
//                if (i==-1) {
//                    System.out.print(j + "\t");
//                }else if (i==0) {
//                        System.out.print("----");
//                    } else
//                System.out.print((i*j) + "\t");
//            }
//            System.out.println();
//        }
    }
}
