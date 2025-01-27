package map;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> concurrentHashMap = new ConcurrentHashMap<>();
        // add key-value pairs (thread safe)
        concurrentHashMap.put("Apple", 10);
        concurrentHashMap.put("Banana", 20);
        concurrentHashMap.put("Orange", 30);
        // use putIfAbsent() to add a value only if the key is absent
        // key "Apple" already exists, so this will be ignored
        concurrentHashMap.putIfAbsent("Apple", 15);
        System.out.println("After putIfAbsent() method : " + concurrentHashMap);
        // replace a value atomically
        // replaces the value only if the current value is 20
        concurrentHashMap.replace("Banana", 20, 25);
        System.out.println("After replace() method : " + concurrentHashMap);
        // remove a key-value pair conditionally
        // remove "Orange" only if its current value is 30
        concurrentHashMap.remove("Orange", 30);
        System.out.println("After conditional remove() : " + concurrentHashMap);
        // iterate over the map (weakly consistent iteration)
        for(Map.Entry<String, Integer> entry : concurrentHashMap.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        // computeIfAbsent()
        concurrentHashMap.computeIfAbsent("Grapes", key->40);
        System.out.println("After computeIfAbsent() : " + concurrentHashMap);
        // computeIfPresent
        // updates value of "Apple" if this key is present otherwise returns null
        concurrentHashMap.computeIfPresent("Apple", (key, value)->(value+5));
        System.out.println("After computeIfPresent() method : " + concurrentHashMap);
        // concurrentHashMap.reduceValues(1, (a, b)->(a+b));
        // OR
        Integer sum = concurrentHashMap.reduceValues(1, Integer::sum);
        System.out.println("Sum of all values : " + sum);
    }
}
