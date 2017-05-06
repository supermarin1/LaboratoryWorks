package testdatetime;

import java.time.*;
import java.time.format.DateTimeFormatter;

/**
 * Created by Maringa on 06.05.2017.
 */
public class MainDateTime {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate birthday = LocalDate.of(1989, Month.DECEMBER, 12);
        int age = Period.between(birthday, now).getYears();
        System.out.println("I'm " + age + " years old");

        System.out.println("I was born on " + birthday.getDayOfWeek().toString().toLowerCase());
        LocalDate thisYearBrthd = LocalDate.of(2017, birthday.getMonth(), birthday.getDayOfMonth());
        System.out.println("It will be on " + thisYearBrthd.getDayOfWeek().toString().toLowerCase() + " this year");

        //determine was whether this year's birthday
        if (age < (now.getYear() - birthday.getYear())) {
            System.out.println("wasn't");
        }
        if (age > (now.getYear() - birthday.getYear())) {
            System.out.println("was");
        }
        if (age == (now.getYear() - birthday.getYear())) {
            System.out.println("today");
        }

        DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;

        ZoneId kiev = ZoneId.of("Europe/Kiev");
        ZoneId london = ZoneId.of("Europe/London");
        ZoneId shanghai = ZoneId.of("Asia/Shanghai");

        LocalDateTime kievDT = LocalDateTime.now(kiev);
        System.out.println(kievDT.format(formatter));

        LocalDateTime londonDT = LocalDateTime.now(london);
        System.out.println(londonDT.format(formatter));

        LocalDateTime beijingDT = LocalDateTime.now(shanghai);
        System.out.println(beijingDT.format(formatter));

    }
}
