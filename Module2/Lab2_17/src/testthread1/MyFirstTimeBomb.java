package testthread1;

/**
 *
 */
class MyFirstTimeBomb extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is started");

        for (int i = 10; i > 0; i--) {
            System.out.println(Thread.currentThread().getName() + "- count " + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Boom!!");
        System.out.println(Thread.currentThread().getName() + " ends");
    }
}

