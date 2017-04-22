package testcore2;

import java.math.BigDecimal;
import java.math.MathContext;

/**
 * Created by Maringa on 20.04.2017.
 */
public class Main {
    public static void main(String[] args) {
        BigDecimal money = new BigDecimal("1.0");
        int count = 0;

        BigDecimal first = new BigDecimal("0.1");


        for (BigDecimal i = first; money.compareTo(new BigDecimal("0.0")) > 0; i = i.add(first)) {
            money = money.subtract(i);
            count++;
        }
        System.out.println(count + " nails was bought. $" + money + " is left. :-(");


    }
}
