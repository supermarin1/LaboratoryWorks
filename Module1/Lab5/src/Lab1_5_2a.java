/**
 * Created by Maringa on 16.01.2017.
 */
import java.util.Scanner;

public class Lab1_5_2a {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int myX = sc.nextInt();

        if (myX == 1) {
            System.out.println("One");
        }
        else if (myX ==2) {
            System.out.println("Two");
        }
        else if (myX == 3) {
            System.out.println("Tree");
        }
        else if (myX == 4) {
            System.out.println("Four");
        }
        else if (myX == 5) {
            System.out.println("Five");
        }
        else if (myX == 6) {
            System.out.println("Six");
        }
        else if (myX == 7) {
            System.out.println("Seven");
        }
        else if (myX == 8) {
            System.out.println("Eight");
        }
        else if (myX == 9) {
            System.out.println("Nine");
        }
        else {
            System.out.println("Other");
        }
    }
}

