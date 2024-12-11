package collectionsframework.list;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;

public class LinkedListExample {
    public static void main(String[] args) {
        // 1. Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // 2. Adding elements
        linkedList.add("Alice");
        linkedList.add("Bob");
        linkedList.add("Charlie");
        linkedList.add(1, "Daisy");  // Add at index
        linkedList.addFirst("Zara"); // Add at the beginning
        linkedList.addLast("Eve");   // Add at the end

        System.out.println("After adding elements: " + linkedList);

        // 3. Removing elements
        linkedList.remove();             // Removes the first element
        linkedList.remove("Charlie");    // Removes by value
        linkedList.remove(1);            // Removes element at index
        linkedList.removeFirst();        // Removes the first element
        linkedList.removeLast();         // Removes the last element
        linkedList.add("Alice");
        linkedList.add("Bob");
        linkedList.add("Alice");
        linkedList.removeFirstOccurrence("Alice"); // Removes first occurrence of "Alice"
        linkedList.removeLastOccurrence("Alice");  // Removes last occurrence of "Alice"
        System.out.println("After removing elements: " + linkedList);

        // 4. Retrieving elements
        linkedList.addFirst("Zara");
        linkedList.addLast("Eve");
        System.out.println("Element at index 1: " + linkedList.get(1));
        System.out.println("First Element: " + linkedList.getFirst());
        System.out.println("Last Element: " + linkedList.getLast());

        // 5. Checking and searching
        System.out.println("Contains 'Alice': " + linkedList.contains("Alice"));
        System.out.println("Index of 'Bob': " + linkedList.indexOf("Bob"));
        System.out.println("Last index of 'Bob': " + linkedList.lastIndexOf("Bob"));
        System.out.println("Is list empty? " + linkedList.isEmpty());
        System.out.println("Size of list: " + linkedList.size());

        // 6. Iterating over elements
        System.out.println("Iterating using for-each:");
        for (String name : linkedList) {
            System.out.println(name);
        }

        System.out.println("Iterating using Iterator:");
        Iterator<String> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("Iterating in reverse order:");
        ListIterator<String> listIterator = linkedList.listIterator(linkedList.size());
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }

        // 7. Offer, Poll, Push, and Pop
        linkedList.offer("Grace");      // Add to the end
        linkedList.offerFirst("Hank"); // Add to the beginning
        linkedList.offerLast("Ivy");   // Add to the end
        System.out.println("After offer operations: " + linkedList);

        System.out.println("Poll (retrieve and remove head): " + linkedList.poll());
        System.out.println("Poll First: " + linkedList.pollFirst());
        System.out.println("Poll Last: " + linkedList.pollLast());
        System.out.println("After poll operations: " + linkedList);

        linkedList.push("John"); // Add at the beginning
        System.out.println("After push operation: " + linkedList);

        System.out.println("Pop (remove and retrieve first): " + linkedList.pop());
        System.out.println("After pop operation: " + linkedList);

        // 8. Convert to array
        Object[] array = linkedList.toArray();
        System.out.println("Array: ");
        for (Object obj : array) {
            System.out.println(obj);
        }

        // 9. Descending iterator
        System.out.println("Descending iterator:");
        Iterator<String> descendingIterator = linkedList.descendingIterator();
        while (descendingIterator.hasNext()) {
            System.out.println(descendingIterator.next());
        }

        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);
        numbers.add(30);
        System.out.println("Original List: " + numbers);
        // Remove elements greater than 20
        boolean removed = numbers.removeIf(number -> number > 20);
        System.out.println("Was anything removed? " + removed);
        System.out.println("Updated List: " + numbers);
    }
}
