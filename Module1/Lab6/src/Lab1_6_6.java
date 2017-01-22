import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Arrays;

/**
 * Write a program that sorts an array
 * of average temperature values by months of 2015 as follows:
 * at first the negative values, then - positive values
 */
public class Lab1_6_6 {
    public static void main(String[] args) {
        double[] aveTemp = {-5.5, -4.3, 0.3, 7.0, 12.6, 15.5,
                17.6, 16.4, 12.3, 6.3, 2.2, -2.8};
        System.out.println("Average temperature by month: ");
        System.out.println(Arrays.toString(aveTemp));
        double x;

        //Arrays.sort(aveTemp);
        for (int i = 0; i < aveTemp.length; i++) {
            for (int j = aveTemp.length - 1; j > i; j--) {
                if(aveTemp[j-1] > aveTemp[j]) {
                    x = aveTemp[j-1];
                    aveTemp[j-1] = aveTemp[j];
                    aveTemp[j] = x;
                }
            }
        }
        System.out.println("Sorted: ");
        System.out.println(Arrays.toString(aveTemp));
    }
}
