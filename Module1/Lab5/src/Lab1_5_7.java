/*
 * Writing simple console application, using nested-loop and if-else construction and arithmetic operators.
 * 6, 28, 496, 8128
 */
import java.util.Scanner;

public class Lab1_5_7 {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println();
        boolean check = false;

        //Odd perfect number was not found yet. We will check only even numbers.
        System.out.print("Perfect numbers between 1 and " + num + " are: ");
        for (int i = 2; i <= num; i+=2) {
            int divSum = 0;
            for (int j = 1; j <= i/2; j++) {
                if (i % j == 0) {
                    divSum = divSum + j;
                    }
                }
            if (divSum == i) {
                System.out.print(i + " ");
                check = true;
            }
        }
        if (!check) System.out.println(":-( there is no perfect numbers");
        System.out.println();
    }
}