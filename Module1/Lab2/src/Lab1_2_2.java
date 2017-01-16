/**
 * Task:
 * Write a program that:
 * 1.Creates a Scanner to read from the keyboard;
 * 2.Prints an invitation to enter the student's name, example: "Enter the name of the student:";
 * 3.Introduces the student's name in the line-invitation, and then outputs it in next line.
 */
import java.util.Scanner;

public class Lab1_2_2 {
    public static void main (String [] args) {
        System.out.print("Enter the name of the student: ");
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        System.out.println ("Student's name is " + line);
    }
}