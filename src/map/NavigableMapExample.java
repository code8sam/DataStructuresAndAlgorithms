package map;

import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.TreeMap;

public class NavigableMapExample {
    public static void main(String[] args) {
        // create a NavigableMap using TreeMap
        NavigableMap<Integer, String> navigableMap = new TreeMap<>();
        // adding key-value pairs
        navigableMap.put(10, "Ten");
        navigableMap.put(20, "Twenty");
        navigableMap.put(30, "Thirty");
        navigableMap.put(40, "Forty");
        navigableMap.put(50, "Fifty");
        // display the entire map
        System.out.println("Original NavigableMap : " + navigableMap);
        // Navigational Methods :
        // ceilingEntry(K key) : returns the entry with the least key greater than or equal to the given key
        Map.Entry<Integer, String> ceilingEntry = navigableMap.ceilingEntry(25);
        System.out.println("Ceiling Entry for 25 : " + ceilingEntry);
        // ceilingKey(K key) : returns the least key greater than or equal to the given key
        Integer ceilingKey = navigableMap.ceilingKey(25);
        System.out.println("Ceiling key (>=25) : " + ceilingKey);
        // floorEntry(K key) : returns the entry with the greatest key less than or equal to the given key
        Map.Entry<Integer, String> floorEntry = navigableMap.floorEntry(25);
        System.out.println("Floor Entry for 25 : " + floorEntry);
        // floorKey(K key) : returns the greatest key less than or equal to the given key
        Integer floorKey = navigableMap.floorKey(25);
        System.out.println("Floor key (<=25) : " + floorKey);
        // higherEntry(K key) : returns the entry with the least key strictly greater than the given key
        Map.Entry<Integer, String> higherEntry = navigableMap.higherEntry(30);
        System.out.println("Higher entry for 30 : " + higherEntry);
        // higherKey(K key) : returns the least key strictly greater than the given key
        Integer higherKey = navigableMap.higherKey(30);
        System.out.println("Higher key (>30) : " + higherKey);
        // lowerEntry(K key) : returns the entry with the greatest key strictly less than the given key
        Map.Entry<Integer, String> lowerEntry = navigableMap.lowerEntry(30);
        System.out.println("Lower entry for 30 : " + lowerEntry);
        // lowerKey(K key) : returns the greatest key strictly less than the given key
        Integer lowerKey = navigableMap.lowerKey(30);
        System.out.println("Lower key (>30) : " + lowerKey);
        // descending order methods :
        // descendingMap() : returns a map in reverse order
        NavigableMap<Integer, String> reversedMap = navigableMap.descendingMap();
        System.out.println("Reversed Map : " + reversedMap);
        // descendingKeySet() : returns the keys in reverse order as a NavigableSet
        NavigableSet<Integer> reversedKeySet = navigableMap.descendingKeySet();
        System.out.println("Reversed Key Set : " + reversedKeySet);
        // Subset Views :
        // headMap(K toKey, boolean inclusive) : returns a view of the map whose keys are less than (or equal to if inclusive is true) the given key.
        NavigableMap<Integer, String> headMap = navigableMap.headMap(30, true);
        System.out.println("HeadMap (keys<30, inclusive) : " + headMap);
        // tailMap(K fromKey, boolean inclusive) : returns a view of the map whose keys are greater than (or equal to if inclusive is true) the given key
        NavigableMap<Integer, String> tailMap = navigableMap.tailMap(30, true);
        System.out.println("TailMap (keys>=30 inclusive) : " + tailMap);
        // subMap(K fromKey, boolean fromInclusive, K toKey, boolean toInclusive) : returns a view of the map containing keys in the specified range, with inclusivity control
        NavigableMap<Integer, String> subMap = navigableMap.subMap(20, true, 40, true);
        System.out.println("SubMap (20<= keys <=40) : " + subMap);
    }
}
