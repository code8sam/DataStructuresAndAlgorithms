package collectionsframework.list;

import java.util.LinkedList;
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // create a stack
        Stack<Integer> stack = new Stack<>();
        // add elements into the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack);
        // pop element from the stack
        Integer removedElement = stack.pop();
        System.out.println(stack);
        // peek which element is on top
        Integer peek = stack.peek();
        System.out.println(peek);
        System.out.println(stack);
        // check if stack is empty
        boolean empty = stack.isEmpty();
        System.out.println(empty);
        // size of stack
        int size = stack.size();
        System.out.println(size);
        // Since Stack extends Vector
        // we can use add method of Vector to add anything in between also
        stack.add(1, 3);
        // search method
        // returns 1-based position where an obj is on this stack
        int search = stack.search(3);
        System.out.println(search);

        // LinkedList as Stack
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.addLast(1); // acts as push
        linkedList.addLast(2);
        linkedList.addLast(3);
        linkedList.getLast(); // acts as peek
        linkedList.removeLast(); // acts as pop
        linkedList.size();
        linkedList.isEmpty();
        System.out.println(linkedList);
    }
}
