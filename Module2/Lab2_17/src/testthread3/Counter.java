package testthread3;

/**
 *
 */
public class Counter extends Thread {
    @Override
    public void run() {
        Storage myStorage = new Storage();
        for (int i = 0; i <= 1_000_000; i++) {
            myStorage.storage.add(i);
        }
    }
}
