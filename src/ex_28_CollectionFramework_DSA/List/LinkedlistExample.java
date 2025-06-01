package ex_28_CollectionFramework_DSA.List;

import java.util.LinkedList;
import java.util.List;

public class LinkedlistExample {
    public static void main(String[] args) {
        List l=new LinkedList();// InitialCapcity is not supported in Linkedlist
        l.add("a");
        l.add("b");
        l.add("c");

        // Location can be anywhere in list for these items
        System.out.println(l);

    }
}
