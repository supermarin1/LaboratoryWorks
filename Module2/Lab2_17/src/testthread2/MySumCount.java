package testthread2;

/**
 *
 */
public class MySumCount implements Runnable{
    private int startIndex;
    private int stopIndex;
    private int[] array;
    private long resultSum ;

    public MySumCount(int startIndex, int stopIndex) {
        this.startIndex = startIndex;
        this.stopIndex = stopIndex;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " calculation starts");
        long tempSum = 0;
        for (int i = startIndex; i < stopIndex+1; i++) {
            tempSum += array[i];
        }
       this.resultSum = tempSum;
        System.out.println(Thread.currentThread().getName() + " calculation ends");
    }

    public long getResultSum() {
        return resultSum;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getStopIndex() {
        return stopIndex;
    }

    public void setStopIndex(int stopIndex) {
        this.stopIndex = stopIndex;
    }
}
