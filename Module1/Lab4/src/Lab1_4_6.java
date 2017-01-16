import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Using Bitwise operators
 */
public class Lab1_4_6 {
    public static void main(String[] args) {
    int myIntA = 15; // 0000_0000_0000_0000_0000_0000_0000_1111
    int myIntB = -20; // 1111_1111_1111_1111_1111_1111_1110_1100

        System.out.println("Initial value A = " + myIntA + " and B = " + myIntB);

        System.out.println("AND " + (myIntA & myIntB)); // 0000_0000_0000_0000_0000_0000_0000_1100
        System.out.println("OR " + (myIntA | myIntB)); // 1111_1111_1111_1111_1111_1111_1110_1111
        System.out.println("XOR " + (myIntA ^ myIntB)); // 1111_1111_1111_1111_1111_1111_1110_0011
        System.out.println("NOT A " + (~myIntA)); // 1111_1111_1111_1111_1111_1111_1111_0000
    }
}
