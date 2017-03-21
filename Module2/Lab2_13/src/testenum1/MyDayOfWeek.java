package testenum1;

/**
 *
 */
public enum MyDayOfWeek {
    SUNDAY("Is Java Day"),
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY("Is Java Day");

    private final String isJavaDay;

    MyDayOfWeek() {
        isJavaDay = "Not Java Day";
    }

    MyDayOfWeek(String isJavaDay) {
        this.isJavaDay = isJavaDay;
    }

    public static MyDayOfWeek nextDay(String dayOfWeek) {
        int orderOfInput = MyDayOfWeek.valueOf(dayOfWeek).ordinal();
        MyDayOfWeek[] days = MyDayOfWeek.values();
        return days[orderOfInput + 1];
    }

    public String isJavaDay() {
        return isJavaDay;
    }
}
