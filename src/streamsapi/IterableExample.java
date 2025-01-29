package streamsapi;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterableExample implements Iterable<String> {

    private List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

    @Override
    public Iterator<String> iterator(){
        return names.iterator();
    }

    public static void main(String[] args) {
        IterableExample example = new IterableExample();
        // using iterator
        Iterator<String> iterator = example.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        // using enhanced for-loop
        for(String name : example){
            System.out.println(name);
        }
    }
}
