package streamsapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Apple", "Banana", "Cherry"));
        // ListIterator
        ListIterator<String> listIterator = list.listIterator();
        // hasNext() : returns true if the list has more elements when moving forward
        // next() : returns the next element and moves forward
        // nextIndex() : returns the index of the next element
        System.out.println("Forward Traversal : ");
        while(listIterator.hasNext()){
            System.out.println("Value at index " + listIterator.nextIndex() + " is : " + listIterator.next());
        }

        // hasPrevious() : returns true if there are elements when moving backward
        // previous() : returns the previous element and moves backward
        // previousIndex() : returns the index of the previous element
        System.out.println("\nBackward Traversal : ");
        while(listIterator.hasPrevious()){
            System.out.println("Value at index " + listIterator.previousIndex() + " is : " + listIterator.previous());
        }

        // set(E e) :replaces the last element returned by next() or previous() with e
        // modifying elements while iterating
        // resetting iterator
        listIterator = list.listIterator();
        while(listIterator.hasNext()){
            String fruit = listIterator.next();
            if(fruit.equals("Banana")){
                // replacing "Banana" with "Mango"
                listIterator.set("Mango");
            }
        }
        System.out.println("\nModified List : " + list);

        // remove() : removes the last element returned by next() or previous()
        // add(E e) : inserts e at the current position

        // remove() is only allowed after next() or previous() : So, call next() first
        // nextIndex() shows where the iterator is about to go, not the current index : So, move forward first, then check
        System.out.println("\nList after removing and adding a value at an index");
        // resetting the iterator
        listIterator = list.listIterator();
        while(listIterator.hasNext()){
            // moving to the next element first
            String element = listIterator.next();
            // check the correct index : n+1 if you want changes at n
            if(listIterator.previousIndex() == 2){
            // OR
            // if(listIterator.nextIndex() == 3){
                listIterator.remove();
                listIterator.add("Strawberry");
            }
        }
        System.out.println("\nModified List : " + list);
    }
}