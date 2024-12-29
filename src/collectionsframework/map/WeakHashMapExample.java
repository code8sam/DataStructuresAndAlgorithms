package collectionsframework.map;

import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapExample {
    public static void main(String[] args) {
        // create a WeakHashMap
        Map<Object, String> weakMap = new WeakHashMap<>();
        // create a key-value pair
        Object key1 = new Object();
        Object key2 = new Object();

        weakMap.put(key1, "Value1");
        weakMap.put(key2, "Value2");
        // print the map
        System.out.println("WeakHashMap before GC: " + weakMap);
        // remove strong reference to key1
        key1 = null;
        // request garbage collection
        System.gc();
        // wait for GC to complete
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // print the map again
        System.out.println("WeakHashMap after GC: " + weakMap);
    }
}
