package Arrays;

import java.util.ArrayList;

public class ArrayListIntro {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(3);
        list.add(67);
        list.add(234);
        list.add(654);
        list.add(67);

        System.out.println(list);

        // add a new item and also mention index
        list.add(3, 45);

        System.out.println(list);

        // length of arraylist

        System.out.println(list.size());

        // to get value of a particular index

        Integer value = list.get(2);
        System.out.println(value);

        // to check it contains a value or not

        System.out.println(list.contains(654));

        // replace by a new value

        list.set(0, 99);
        System.out.println(list);

        // entirely removes that index value

        list.remove(2);
        System.out.println(list);


    }
}
