/*
 *Writing simple console application, using loop and arithmetic operators.
 */
import java.util.Scanner;

public class Lab1_5_6 {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner (System.in);
        int number = sc.nextInt();
        int sum = 0;

        while (number != 0) {
            sum = sum + (number % 10)*(number % 10);
            number /= 10;
        }
        System.out.println("The sum of squares of digits of number is " + sum);
    }
}
