package ex_28_CollectionFramework_DSA.List;

import java.util.LinkedList;

public class LinkedlistExample1 {
    public static void main(String[] args) {
        LinkedList<String> animals=new LinkedList();

        // Other than String it cannot allow anything

        animals.add("Dog");
        animals.add("Cat");
        animals.add("Lion");
        animals.add("Elephant");
        System.out.println("Linkedlist: " +animals);

        System.out.println("Firstelement: " +animals.getFirst());// FirstElement will be get
        System.out.println("LastElement: "+animals.getLast()); // LastElement will be get

        animals.removeFirst();// FirstElement will be removed
        animals.removeLast(); // LastElement will be removed

        System.out.println("Linkedlist after removal: "+animals);

        System.out.println("Size of Linkedlist: "+animals.size());
    }
}
