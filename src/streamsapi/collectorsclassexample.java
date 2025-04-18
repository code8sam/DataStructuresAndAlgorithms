package streamsapi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class collectorsclassexample {
    public static void main(String[] args) {
        // Example 1 : Collecting names by length
        List<String> l1 = Arrays.asList("Anna", "Bob", "Alexander", "Brian", "Alice");
        Map<Integer, List<String>> collectl1 = l1.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(collectl1);

        // Example 2 : counting word occurrences
        String sentence = "hello world hello java world";
        Map<String, Long> collectSentence = Arrays.stream(sentence.split(" ")).collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        System.out.println(collectSentence);

        // Example 3 : Partitioning even and odd numbers
        List<Integer> l2 = Arrays.asList(1, 2, 3, 4, 5, 6);
        Map<Boolean, List<Integer>> collectl2 = l2.stream().collect(Collectors.partitioningBy(x -> x % 2 == 0));
        System.out.println(collectl2);

        // Example 4 : Summing values in a map
        Map<String, Integer> items = Map.of("Apple", 10, "Banana", 15, "Orange", 20);
        Optional<Integer> collectItems = items.values().stream().collect(Collectors.reducing(Integer::sum));
        System.out.println(collectItems.get());

        // Example 5 : Creating a Map from stream elements
        List<String> fruits = Arrays.asList("Apple", "Banana", "Cherry");
        Map<Integer, String> fruitsInMap = fruits.stream().collect(Collectors.toMap(
                x -> x.length(),
                x -> x,
                (oldValue, newValue) -> oldValue
        ));
        System.out.println(fruitsInMap);
    }
}
