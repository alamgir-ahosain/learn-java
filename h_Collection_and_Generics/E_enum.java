package h_Collection_and_Generics;

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class E_enum {
    static void enumFunc() {

        Day today = Day.TUESDAY; // assign enum constant
        for (Day d : Day.values()) { // returns all constants.
            System.out.println(d + " (ordinal: " + d.ordinal() + ")"); // gives position of constant (0-based).
        }

        Day holiday = Day.valueOf("FRIDAY"); // Convert String enum constant.
        System.out.println(holiday);

    }

    public static void main(String[] args) {
        enumFunc();

    }
}
