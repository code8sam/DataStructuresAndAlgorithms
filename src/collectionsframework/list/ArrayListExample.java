package collectionsframework.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // add a value
        list.add(1);
        list.add(5);
        list.add(80);

        // get a value
        System.out.println(list.get(0));

        // size of the list
        System.out.println(list.size());

        // for loop in list
        for (int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

        // for-each loop
        for (int element : list){
            System.out.println(element);
        }

        // check if list contains a specific value
        System.out.println(list.contains(5));

        // remove a value at a specific index
        list.remove(0); // value specified is index
        System.out.println(list);

        // add a value between two index
        list.add(1, 50);
        System.out.println(list); // shifts the old value to next index

        // replaces value at a specific index
        list.set(1, 39); // old value is removed
        System.out.println(list);

        // List from a given array
        List<String> list1 = Arrays.asList("Monday", "Tuesday");
        System.out.println(list1.getClass().getName());
        // Exception will occur if we try to add elements in the list made via method .asList
        // because it returns a fixed size list
//        list1.add("Wednesday");

        // List using .of() method
        List<Integer> list3 = List.of(1, 2, 3, 4);
        // Exception will occur as we are trying to modify an unmodifiable list :
        // immutable object is modified
//        list3.set(1, 33);

        List<Integer> list4 = new ArrayList<>();
        list4.add(1);
        list4.add(2);
        list4.add(3);
        list4.add(4);
        list4.add(5);

        List<Integer> list5 = List.of(6, 7, 8, 9, 10);

        // using addAll() method
        list4.addAll(list5);

        System.out.println("List after appending : " + list4);

        List<String> list6 = new ArrayList<>();
        list6.add("Apple");
        list6.add("Mango");
        list6.add("Orange");
        // removing elements by index
        list6.remove(1);
        // removing elements by value
        list6.remove("Orange");

        System.out.println("List after removing : " + list6);

        // Converting list to array
        Object[] array1 = list6.toArray();
        // mention type of array too :
        String[] array2 = list6.toArray(new String[0]);

        System.out.println("array1 : "+ Arrays.toString(array1));
        System.out.println("array2 : "+ Arrays.toString(array2));

        // sort an ArrayList
        List<Integer> list7 = new ArrayList<>();
        list7.add(5);
        list7.add(3);
        list7.add(2);
        list7.add(4);
        list7.add(1);
        System.out.println("list7 before sort : "+list7);
        Collections.sort(list7);
        System.out.println("list7 after sort : "+list7);
    }
}
