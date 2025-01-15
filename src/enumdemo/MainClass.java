package enumdemo;

public class MainClass {
    public static void main(String[] args) {
        System.out.println(Day.MONDAY);
        Day monday = Day.MONDAY;
        // index of MONDAY
        int ordinal = monday.ordinal();
        System.out.println(ordinal);
        // name of MONDAY
        String name = monday.name();
        System.out.println(name);
        // valueOf : will convert string MONDAY to enum MONDAY
        // only if it is present in enum list
        // or else if throws exception
        Day enumDay = Day.valueOf("MONDAY");
        System.out.println(enumDay);
        // values : array of all enum values
        Day[] values = Day.values();
        for(Day day : values){
            System.out.println(day);
        }
        // using a custom method made in enum class :
        monday.display();

        // using custom fields from enum class :
        String lower = monday.getLower();
        System.out.println(lower);
    }
}
