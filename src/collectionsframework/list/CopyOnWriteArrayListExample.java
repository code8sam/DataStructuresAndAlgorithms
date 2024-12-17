package collectionsframework.list;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExample {
    public static void main(String[] args) {

        // If we use ArrayList
        List<String> shoppingList = new CopyOnWriteArrayList<>();
        shoppingList.add("Milk");
        shoppingList.add("Eggs");
        shoppingList.add("Bread");
        System.out.println("Initial Shopping List :" + shoppingList);
        //  trying to write while reading :
        for (String item : shoppingList){
            System.out.println(item);
            if (item.equals("Eggs")){
                shoppingList.add("Butter");
                System.out.println("Added Butter while reading");
            }
        }
        System.out.println("Updated Shopping List :" + shoppingList);
    }
}
