package TestException;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        int i[] = {6, 9, 10, 50, 2};

        for (int i1 : i) {
            System.out.println("value: " + i1);
            try {
                if (i1 >= 10) throw new Exception("invalid value. must be less than 10");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("I was here");
            }
        }

        for (int i1 : i) {
            System.out.println("value: " + i1);
            try {
                MyTest.test(i1);
            } catch (MyException e) {
                e.printString();
            }
        }




    }
}
