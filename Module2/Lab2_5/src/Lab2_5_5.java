import java.util.Random;
/**
 * Write class InitTest with private field id of int type
 * and static private field nextId of integer.
 * Write code that: * Initialize static field nextId
 * of some random value (in 1 … 1000 range)once when class loaded to JVM;
 * Increments static field nextId each time when new instance of InitTest created;
 * Initialize field id of nextId field value each time when new instance of InitTest created.
 * And method getId() which will return value of id.
 * Create class Main, which will create five instances of class InitTest
 * and invokes method getId() on each instance and print returned value on console.
 */
public class Lab2_5_5 {
    public static void main(String[] args) {

        InitTest test1 = new InitTest();
        InitTest test2 = new InitTest();
        InitTest test3 = new InitTest();
        InitTest test4 = new InitTest();
        InitTest test5 = new InitTest();

        System.out.println(test1.getId());
        System.out.println(test2.getId());
        System.out.println(test3.getId());
        System.out.println(test4.getId());
        System.out.println(test5.getId());

    }

    static class InitTest {
        private int id;
        static int nextId;

        static {
            Random ran = new Random();
            nextId = ran.nextInt(1000);
        }

        public InitTest(){
            nextId ++;
            id = nextId;
        }

        public int getId() {
            return id;
        }
    }
}
