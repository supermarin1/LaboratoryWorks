package testthread2;


import java.util.Random;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        int[] myArray = new int[1000];

        MySumCount sum1 = new MySumCount(10, 15);
        MySumCount sum2 = new MySumCount(150, 190);

        //fill in myArray with random int values
        Random random = new Random(1000);
        for (int i = 0; i < 1000; i++) {
            int temp = random.nextInt();
            myArray[i] = temp;
        }

        sum1.setArray(myArray);
        sum2.setArray(myArray);


        Thread tr1 = new Thread(sum1);
        Thread tr2 = new Thread(sum2);
        tr1.start();
        try {
            tr1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        tr2.start();
        try {
            tr2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("The sum of 1st array" + sum1.getResultSum());
        System.out.println("The sum of 2nd array" + sum2.getResultSum());

    }
}
