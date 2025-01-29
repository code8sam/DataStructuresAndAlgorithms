package set;

import java.util.EnumSet;

enum Days {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}

enum Colors {
    RED, GREEN, BLUE, YELLOW, ORANGE, PURPLE
}

public class EnumSetExample {
    public static void main(String[] args) {
        // creating an EnumSet containing all days
        EnumSet<Days> allDays = EnumSet.allOf(Days.class);
        System.out.println("All Days : " + allDays);
        // creating an empty EnumSet
        EnumSet<Days> noDays = EnumSet.noneOf(Days.class);
        System.out.println("No Days : " + noDays);
        // adding elements
        noDays.add(Days.MONDAY);
        noDays.add(Days.FRIDAY);
        System.out.println("Selected Days : " + noDays);
        // removing an element
        noDays.remove(Days.MONDAY);
        System.out.println("After removing Monday : " + noDays);
        // creating a range of days
        EnumSet<Days> workDays = EnumSet.range(Days.MONDAY, Days.FRIDAY);
        System.out.println("Work Days : " + workDays);
        // copy an EnumSet
        EnumSet<Days> copiedDays = EnumSet.copyOf(workDays);
        System.out.println("Copied Days : " + copiedDays);

        // advanced usage with of() method
        // creating an EnumSet with specific elements
        EnumSet<Colors> primaryColors = EnumSet.of(Colors.RED, Colors.GREEN, Colors.BLUE);
        System.out.println("Primary Colors : " + primaryColors);
        // complement of the primary color
        EnumSet<Colors> otherColors = EnumSet.complementOf(primaryColors);
        System.out.println("Other Colors : " + otherColors);
    }
}
