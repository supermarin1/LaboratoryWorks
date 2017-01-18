/**
 * Writing simple console application, using loop and arithmetic operators.
 */
public class Lab1_5_5 {
    public static void main(String[] args) {
        int sum = 0, count = 0;
        double average;

        for (int i = 1; i < 13; i++) {
            sum += i;
            count++;
        }
        average = (double) sum/count;
        System.out.println("The sum is: " + sum);
        System.out.println("The average is: " + average);
    }
}
