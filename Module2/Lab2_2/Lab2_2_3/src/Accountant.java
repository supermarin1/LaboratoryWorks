/**
 *
 */
public class Accountant {
    public static void main(String[] args) {
        Employee vasya = new Employee();
        Employee petya = new Employee();

        vasya.calcSalary("Vasya", 1,55,66);
        petya.calcSalary("Petya", 55,66,88,2,0,5);

    }
}
