package map;

import java.util.Comparator;
import java.util.Objects;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapExample {
    public static void main(String[] args) {
        // created a SortedMap (default natural ordering)
        SortedMap<Integer, String> sortedMap = new TreeMap<>();
        // adding key-value pairs
        sortedMap.put(10, "Ten");
        sortedMap.put(20, "Twenty");
        sortedMap.put(30, "Thirty");
        sortedMap.put(40, "Forty");
        sortedMap.put(50, "Fifty");
        // display Map
        System.out.println("Original SortedMap : " + sortedMap);
        // retrieve the first and last keys
        System.out.println("First key : " + sortedMap.firstKey());
        System.out.println("Last key : " + sortedMap.lastKey());
        // HeadMap : keys less than 30
        SortedMap<Integer, String> headMap = sortedMap.headMap(30);
        System.out.println("HeadMap (keys<30) : " + headMap);
        // TailMap : keys greater than or equal to 30
        SortedMap<Integer, String> tailMap = sortedMap.tailMap(30);
        System.out.println("TailMap (keys>=30) : " + tailMap);
        // SubMap : keys from 20 (inclusive) to 40 (exclusive)
        SortedMap<Integer, String> subMap = sortedMap.subMap(20, 40);
        System.out.println("SubMap (20<=keys<40) : " + subMap);
        // Created a SortedMap (custom order using Comparator)
        SortedMap<Integer, String> sortedMap2 = new TreeMap<>((a, b) -> b - a);
        sortedMap2.put(10, "Ten");
        sortedMap2.put(20, "Twenty");
        sortedMap2.put(30, "Thirty");
        sortedMap2.put(40, "Forty");
        sortedMap2.put(50, "Fifty");
        System.out.println("SortedMap using Comparator : " + sortedMap2);
    }
}
