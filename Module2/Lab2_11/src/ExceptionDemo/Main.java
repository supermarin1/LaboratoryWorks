package ExceptionDemo;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();

        try {
            person1.setAge(130);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
