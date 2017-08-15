package testthread1;

/**
 *
 */
public class MySecondTimeBomb implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is started");
        for (int i = 10; i > 0; i--) {
            System.out.println(Thread.currentThread().getName() + "- count " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Boom!!");
        System.out.println(Thread.currentThread().getName() + " ends");
    }
}
