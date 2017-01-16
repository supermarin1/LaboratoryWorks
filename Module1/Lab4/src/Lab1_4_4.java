/**
 * •Using increment and decrement
 */
public class Lab1_4_4 {
    public static void main(String[] args) {

        // Declaring and Initializing integer variables
        int myIntA = 10, myIntB;
        System.out.println("Initial value A = " + myIntA);

        myIntB = ++ myIntA;
        System.out.println("PreFix Increment B = ++A. Now A = " + myIntA + " and B = " + myIntB);

        myIntB = myIntA ++;
        System.out.println("PostFix Increment B = A++. Now A = " + myIntA + " and B = " + myIntB);

        myIntB = ++ myIntA;
        System.out.println("PreFix Decrement B = --A. Now A = " + myIntA + " and B = " + myIntB);

        myIntB = myIntA --;
        System.out.println("PostFix Decrement B = A--. Now A = " + myIntA + " and B = " + myIntB);
    }
}
