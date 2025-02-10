
enum Example {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}

public class DaysOfWeek {
    static void checkHoliday(Example day) {
        if (day == Example.SATURDAY || day == Example.SUNDAY) {
            System.out.println(day + " is a Holiday!");
        } else {
            System.out.println(day + " is Not a Holiday.");
        }
    }

    public static void main(String[] args) {
        // Test the enum with different days
        checkHoliday(Example.MONDAY);
        checkHoliday(Example.SATURDAY);
        checkHoliday(Example.WEDNESDAY);
        checkHoliday(Example.SUNDAY);
    }
}

