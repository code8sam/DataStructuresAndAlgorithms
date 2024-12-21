package collectionsframework.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        // create a hashmap
        HashMap<Integer, String> map = new HashMap<>();
        // put method : add key-value pairs
        map.put(1, "Alice");
        map.put(2, "Bob");
        map.put(3, "Charlie");
        map.put(4, null); // null value
        map.put(null, "NullKey"); // null key
        System.out.println("Initial HashMap: " + map);
        // retreive value by key
        System.out.println("Value for key 2: " + map.get(2));
        // remove a key-value pair
        map.remove(3);
        System.out.println("After remvoing key 3:" + map);
        // contains method : check if key exists
        System.out.println("Contains key 1? " + map.containsKey(1));
        // containsValue method : check if value exists ?
        System.out.println("Contains value 'Bob' ? " + map.containsValue("Bob"));
        // keySet : get all values
        Set<Integer> keys = map.keySet();
        System.out.println("Keys: " +keys);
        // values : get all values
        Collection<String> values = map.values();
        System.out.println("Values: " + values);
        // entrySet method : get all key-value pairs as Set
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        // check if HashMap is empty
        System.out.println("Is HashMap empty ? " + map.isEmpty());
        // get the size of HashMap
        System.out.println("Size of HashMap: " + map.size());
        // replace value for a given key
        map.replace(1, "Alex");
        System.out.println("After replacing value for key 1: " + map);
        map.replace(2, "Bob", "Robert");
        System.out.println("After replacing value for key 2: " +map);
        // putIfAbsent : add key-value pair only if key is absent
        map.putIfAbsent(5, "Diana");
        System.out.println("After putIfAbsent: " + map);
        // merge : merge values for a key
        map.merge(1, "NewName", (oldValue, newValue) -> oldValue + "-" + newValue);
        System.out.println("After merge for key 1: " + map);
        // compute method : recalculate value for a key
        map.compute(2, (key, value)->value+" Jr. ");
        System.out.println("After compute for key 2: " +map);
        // computeIfAbsent method : compute value if key is absent
        map.computeIfAbsent(6, key->"ComputedValue");
        System.out.println("After computeIfAbsent for key 6: " + map);
        // computeIfPresent method : compute value if key is present
        map.computeIfPresent(5, (key, value)->value+" (Updated)");
        System.out.println("After computeIfPresent for key 5: " + map);
        // clear method : remove of all key-value pairs
        map.clear();
        System.out.println("After clear: " + map);
    }
}
