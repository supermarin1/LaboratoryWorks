package testgenerics1;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        MyTuple myFirstTuple = new MyTuple("Ololo", Integer.valueOf(5), Long.valueOf(122L));
        MyTuple mySecondTuple = new MyTuple(Double.valueOf(5.5), "ololo", "blabla");
    }
}
