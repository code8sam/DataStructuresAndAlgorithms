package collectionsframework.map;

import java.util.IdentityHashMap;

public class IdentityHashMapExample {
    public static void main(String[] args) {
        // create an IdentityHashMap
        IdentityHashMap<String, String> identityMap = new IdentityHashMap<>();
        // create keys
        String key1 = new String("Key");
        String key2 = new String("Key");

        // add entries to the map
        identityMap.put(key1, "Value1");
        identityMap.put(key2, "Value2");

        // print the map
        System.out.println("IdentityHashMap: " + identityMap);

        //check if the two keys are equal
        System.out.println("key1.equals(key2): " + key1.equals(key2));
        System.out.println("key1 == key2: " + (key1 == key2));
    }
}
