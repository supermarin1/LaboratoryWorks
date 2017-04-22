package testcore3;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by Maringa on 20.04.2017.
 */
public class Main {
    public static void main(String[] args) {
        Locale curLoc = Locale.getDefault();
        System.out.println("Current Locale: " + curLoc.getDisplayName());

        NumberFormat formatter = NumberFormat.getIntegerInstance();
        System.out.println("Integer: " + formatter.format(20000000));

        formatter = NumberFormat.getNumberInstance();
        System.out.println("Double: " + formatter.format(3.2));

        formatter = NumberFormat.getCurrencyInstance();
        System.out.println("Currency: " + formatter.getCurrency() + " " + formatter.format(200));

        DateFormat dateFormatter = DateFormat.getDateInstance();
        Date currentDate = new Date();
        String date = dateFormatter.format(currentDate);
        System.out.println("Date: " + date);

    }
}
