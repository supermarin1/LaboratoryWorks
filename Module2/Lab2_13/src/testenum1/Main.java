package testenum1;

import java.util.Scanner;

import static testenum1.MyDayOfWeek.nextDay;


/**
 *
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("   *** Lab 2_13_1 ***   ");
        for (MyDayOfWeek myDayOfWeek : MyDayOfWeek.values()) {
            System.out.println(myDayOfWeek);
        }

        System.out.println("   *** Lab 2_13_2 ***   ");
        for (MyDayOfWeek myDayOfWeek : MyDayOfWeek.values()) {
            switch (myDayOfWeek.isJavaDay()) {
                case "Is Java Day":
                    System.out.println("My Java Day: " + myDayOfWeek.name());
            }
        }

        System.out.println("   *** Lab 2_13_3 ***   ");
        Scanner sc = new Scanner(System.in);
        String days = sc.next().toUpperCase();

        System.out.println(nextDay(days));

        sc.close();

    }
}
