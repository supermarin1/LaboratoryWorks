package Calculator;

/**
 *
 */
public class Calculator {
    private double[] a = new double[0];
    private String[] o = new String[0];
    private double result;

    public Calculator(double[] a, String[] o) {
        this.a = a;
        this.o = o;
    }

    public void calcAll() {
        result = a[0];
        for (int i = 0; i < o.length; i++) {
            switch (o[i]) {
                case "*": {
                    result *= a[i + 1];
                    break;
                }
                case "/": {
                    result /= a[i + 1];
                    break;
                }
                case "+": {
                    result += a[i + 1];
                    break;
                }
                case "-": {
                    result -= a[i + 1];
                    break;
                }
//                default: {
//                    System.out.println("Invalid operation input.");
//                }
            }
        }
    }

    public double getResult() {
        return result;
    }

}
