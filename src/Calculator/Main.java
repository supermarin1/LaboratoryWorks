package Calculator;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] number = new double[0];
        String[] operation = new String[0];
        String op;

        System.out.println("Enter the expression below: ");

        for (int i = 0; i < i+1; i++) {
            number = addNumber(number, sc.nextDouble());
            op = sc.next();
            operation = addOperation(operation, op);
            if (op.equals("=")) break;
        }

        Calculator calc = new Calculator(number, operation);
        calc.calcAll();
        System.out.println("The result is: " + calc.getResult());

    }

    private static double[] addNumber(double[] number, double newNumber) {
        double[] newNumbers = Arrays.copyOf(number, number.length + 1);
        newNumbers[newNumbers.length - 1] = newNumber;
        return newNumbers;
    }

    private static String[] addOperation(String[] operation, String newOperation) {
        String[] newOperations = Arrays.copyOf(operation, operation.length + 1);
        newOperations[newOperations.length - 1] = newOperation;
        return newOperations;
    }


}
