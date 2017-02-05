/**
 *Create class MyInitTest with two initialization blocks,
 * two static initialization blocks and two constructors
 * (one constructor() must invoke second constructor(int)).
 * On each block write code that prints on console type of block and block number.
 * Create class Main, which will create instance of class MyInitTest by invoking first constructor.
 */
public class Lab2_5_1 {
    public static void main(String[] args) {
        MyIntTest test = new MyIntTest();

    }

    static class MyIntTest {

        static int a = 10;

        {
            System.out.println("non-static initialization block 1");
        }

        {
            System.out.println("non-static initialization block 2");
        }

        static {
            System.out.println("static initialization block 1");
        }
        static {
            System.out.println("static initialization block 2");
        }

        public MyIntTest (int a){
            System.out.println("constructor 2");
        }

        public MyIntTest (){
            this(a);
            System.out.println("constructor 1");
        }
    }
}
