package set;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        // creating a TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();
        // adding elements
        treeSet.add(50);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(10);
        treeSet.add(40);
        // printing the TreeSet (in natural order)
        System.out.println("TreeSet : " + treeSet);
        // accessing elements
        System.out.println("First Element : " + treeSet.first());
        System.out.println("Last Element : " + treeSet.last());
        // navigating the Set
        System.out.println("HeadSet (<30) : " + treeSet.headSet(30));
        System.out.println("TailSet (>=30) : " + treeSet.tailSet(30));
        System.out.println("SubSet (>20 AND <=40) : " + treeSet.subSet(20, false, 40, true));
        Integer ceiling = treeSet.ceiling(25);
        System.out.println("Value strictly >= 25 : " + ceiling);
        Integer higher = treeSet.higher(17);
        System.out.println("Value strictly > 17 : " + higher);
        Integer floor = treeSet.floor(25);
        System.out.println("Value strictly <= 25 : " + floor);
        Integer lower = treeSet.lower(17);
        System.out.println("Value strictly < 17 : " + lower);

        // Creating a TreeSet with custom comparator (reverse order)
        TreeSet<Integer> customComparatorTreeSet = new TreeSet<>(Comparator.reverseOrder());
        // adding elements :
        customComparatorTreeSet.add(4);
        customComparatorTreeSet.add(23);
        customComparatorTreeSet.add(17);
        // printing the TreeSet (in reverse order)
        System.out.println("TreeSet (reverse order) : " + customComparatorTreeSet);


    }
}
