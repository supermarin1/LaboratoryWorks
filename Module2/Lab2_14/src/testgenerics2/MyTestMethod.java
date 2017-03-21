package testgenerics2;

/**
 *
 */
class MyTestMethod {
    // Lab 2_14_2
    static <T extends Comparable<T>> int calcNum(T[] array, T maxElement) {
        int countOfElements = 0;
        for (T anArray : array) {
            if (anArray.compareTo(maxElement) > 0) {
                countOfElements++;
            }
        }
        return countOfElements;
    }

    //Lab 2_14_3
    static <T extends Number & Comparable<T>> T calcSum(T[] array, T maxElement) {
        if (maxElement instanceof Long) {
            Long sumOfLongElements = Long.valueOf(0);
            for (T anArray : array) {
                if (anArray.compareTo(maxElement) > 0) {
                    sumOfLongElements = sumOfLongElements + anArray.longValue();
                }
            }
            return (T) sumOfLongElements;
        } else {
            Double sumOfOtherElements = Double.valueOf(0);
            for (T anArray : array) {
                if (anArray.compareTo(maxElement) > 0) {
                    sumOfOtherElements = sumOfOtherElements + anArray.doubleValue();
                }
            }
            return (T) sumOfOtherElements;
        }
    }


}
