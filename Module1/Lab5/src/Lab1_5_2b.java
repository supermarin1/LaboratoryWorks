/**
 * Writing simple console application, using "nested-if"
 */
import java.util.Scanner;

public class Lab1_5_2b {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int myX = sc.nextInt();

        if (myX >= 0 && myX <= 10) {
            if (myX == 1) System.out.println("One");
            if (myX == 2) System.out.println("Two");
            if (myX == 3) System.out.println("Three");
            if (myX == 4) System.out.println("Four");
            if (myX == 5) System.out.println("Five");
            if (myX == 6) System.out.println("Six");
            if (myX == 7) System.out.println("Seven");
            if (myX == 8) System.out.println("Eight");
            if (myX == 9) System.out.println("Nine");
        } else System.out.println("Other");
    }
}
