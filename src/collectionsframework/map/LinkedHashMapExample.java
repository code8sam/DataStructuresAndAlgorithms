package collectionsframework.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Orange", 10);
        linkedHashMap.put("Apple", 20);
        linkedHashMap.put("Guava", 13);
        // Unlike HashMap, elements will be iterated in the order
        // in which they were inserted (insertion order)
        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        // accessOrder Example :
        LinkedHashMap<Integer, String> accessOrderMap = new LinkedHashMap<>(16, 075f, true);
        accessOrderMap.put(1, "One");
        accessOrderMap.put(2, "Two");
        accessOrderMap.put(3, "Three");
        // access element
        accessOrderMap.get(2);
        // check the order after using get() method :
        System.out.println("Access Order Map: ");
        for (Map.Entry<Integer, String> entry : accessOrderMap.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
