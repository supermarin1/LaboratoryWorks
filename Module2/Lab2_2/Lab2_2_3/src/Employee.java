/**
 *
 */
public class Employee {
    public static void calcSalary (String name, double... salary){
        int totalSalary = 0;
        for (double v : salary) {
            totalSalary += v;
        }
        System.out.println(name + " salary is " + totalSalary);
    }
}
