package collectionsframework.map;

import java.util.HashMap;
import java.util.Objects;

public class HashMapEqualsMethodAndHashCodeMethodExample {
    public static void main(String[] args) {
        HashMap<Person, String> map = new HashMap<>();
        // p1 and p3 is same individual
        Person p1 = new Person("Alice",1);
        Person p2 = new Person("Bob", 2);
        Person p3 = new Person("Alice", 1);

        map.put(p1, "Engineer");
        map.put(p2, "Designer");
        map.put(p3, "Manager");

        System.out.println("HashMap size: " + map.size());
        System.out.println("Value for p1: " + map.get(p1));
        System.out.println("Value for p3: " + map.get(p3));
    }
}

    class Person {
        private String name;
        private int id;

        public Person(String name, int id){
            this.name=name;
            this.id=id;
        }

        public String getName(){
            return name;
        }

        public int getId(){
            return id;
        }

        @Override
        public boolean equals(Object obj) {
            if(this==obj){
                return true;
            }
            if(obj==null){
                return false;
            }
            if(getClass()!=obj.getClass()){
                return false;
            }
            Person other = (Person)obj;
            return id == other.getId() && Objects.equals(name, other.getName());
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, id);
        }
    }
