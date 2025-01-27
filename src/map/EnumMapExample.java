package map;

import java.util.EnumMap;

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class EnumMapExample {
    public static void main(String[] args) {
        // Step 1: Create an EnumMap for storing a number of tasks for each day
        EnumMap<Day, String> taskMap = new EnumMap<>(Day.class);

        // Step 2: Populate the map
        taskMap.put(Day.MONDAY, "Team Meeting");
        taskMap.put(Day.TUESDAY, "Code Review");
        taskMap.put(Day.WEDNESDAY, "Client Call");
        taskMap.put(Day.FRIDAY, "Team Retrospective");

        // Step 3: Retrieve a value based on key (day of the week)
        System.out.println("Monday's task: " + taskMap.get(Day.MONDAY)); // Output: Team Meeting

        // Step 4: Check if a particular task is assigned
        System.out.println("Is there a task for Saturday? " + taskMap.containsKey(Day.SATURDAY)); // Output: false

        // Step 5: Remove a task
        taskMap.remove(Day.TUESDAY);
        System.out.println("After removing Tuesday's task: " + taskMap);

        // Step 6: Iterate over the map
        taskMap.forEach((day, task) -> System.out.println(day + ": " + task));
    }
}
