package TestException;

/**
 *
 */
public class MyException extends RuntimeException {
    private String s;
    public MyException(String s) {
        this.s = s;
    }

    void printString () {
        System.out.println("saved string is: " + s);
    }
}
