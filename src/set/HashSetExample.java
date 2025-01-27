package set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        // creating a HashSet
        Set<String> hashset = new HashSet<>();
        // adding elements
        hashset.add("Apple");
        hashset.add("Banana");
        hashset.add("Cherry");
        // duplicate and thus, will not be added
        hashset.add("Apple");
        // printing the set
        System.out.println("HashSet : " + hashset);
        // checking if an element exists
        System.out.println("Contains 'Banana' ? : " + hashset.contains("Banana"));
        // removing an element
        hashset.remove("Banana");
        System.out.println("After removing 'Banana' : " + hashset);
        // iterating over the set
        hashset.forEach((element)-> System.out.println(element));
    }
}
