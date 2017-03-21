package testgenerics3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

/**
 *
 */
public class MyMixer<T> {
    T[] array;

    public MyMixer(T[] array) {
        this.array = array;
    }

    public T[] suffle(T[] array) {
        Random random = new Random();
        for ( int i = 0; i < array.length; i++) {
            int randomPosition = random.nextInt(array.length);
            T dop = array[i];
            array[i] = array[randomPosition];
            array [randomPosition] = dop;
        }
        return array;
    }
}
