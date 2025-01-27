package set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
    public static void main(String[] args) {
       // creating a LinkedHashSet
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(15);
        linkedHashSet.add(10);
        linkedHashSet.add(5);
        // duplicate and thus, will not be added
        linkedHashSet.add(5);
        // printing the set
        System.out.println("LinkedHashSet : " + linkedHashSet);
    }
}
