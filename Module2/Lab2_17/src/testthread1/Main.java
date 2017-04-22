package testthread1;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
//        MyFirstTimeBomb bomb1 = new MyFirstTimeBomb();
//        bomb1.start();

        MySecondTimeBomb bomb2 = new MySecondTimeBomb();
        Thread tr = new Thread(bomb2);
        tr.start();
        try {
            tr.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
