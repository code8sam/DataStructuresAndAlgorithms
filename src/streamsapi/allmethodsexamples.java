package streamsapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class allmethodsexamples {
    public static void main(String[] args) {
        //Example : filtering and collecting names
        List<String> names = Arrays.asList("Anna", "Bob", "Charlie", "David");
        System.out.println(names.stream().filter(x->(x.length()>3)).collect(Collectors.toList()));
        //Example : Squaring and sorting numbers
        List<Integer> numbers = Arrays.asList(5, 2, 9, 1, 6);
        System.out.println(numbers.stream().map(x->(x*x)).sorted((x, y)-> y-x).collect(Collectors.toList()));
        // Example : Sum of all values
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(integers.stream().reduce(0, (Integer::sum)));
        // counting occurrences of a character
        String sentence = "Hello World";
        long count = sentence.chars().filter(x -> x == 'l').count();
        System.out.println(count);
        List<String> sentences = Arrays.asList("Java is great", "Streams are powerful");
        List<String> words = sentences.stream()
                // Split into words
                .flatMap(sentence1 -> Arrays.stream(sentence1.split(" ")))
                .collect(Collectors.toList());
        System.out.println(words);
    }
}
