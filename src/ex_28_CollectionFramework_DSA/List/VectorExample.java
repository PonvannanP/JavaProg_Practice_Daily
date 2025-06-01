package ex_28_CollectionFramework_DSA.List;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector v = new Vector();
        Vector v1 = new Vector(10);// Like Arraylist Initial Capacity can be
        // provided in Vector also

        v.add("Pramod");
        v.add("Amit");
        v.add("Lucky");
        System.out.println(v);
        v.remove("Amit");
        System.out.println(v.contains("Lucky"));
        System.out.println(v);

        System.out.println("---Normal For Loop");

        for (int i = 0; i < v.size(); i++) {
            System.out.println(v.get(i));
        }

        System.out.println("----For each Loop");

        for (Object o : v)// It can contains different data types so we are using Object here
        {
            System.out.println(o);
        }

        System.out.println("----Iterator");

        Iterator iterator = v.iterator();
        // Iterator is used to Iterate the elements it is the most popular one it will be available
        // in LIST, SET and Queue
        //reference also contains iterator

        while (iterator.hasNext()) {
            // Until this Iterator has nextElemets please print the elements
            System.out.println(iterator.next());
        }
        // Iterator is like a arrow first it will Print Pramod then it will print Lucky
        // since Amit is removed

        System.out.println("---Enumeration");
        // This is same like Iterator

        Enumeration<Object> enumeration = v.elements();// You don't need to create new keyword(new Instance)
        // Because reference variable of Vector v has iterator in it that's why we are not using new keyword
        // reference also contains enumeration

        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }

        System.out.println("---ListIterator");
        // // This is same like Iterator

        ListIterator listIterator = v.listIterator();
        // reference also contains listIterator
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());


        }

        System.out.println("\n Backward direction");

        while(listIterator.hasPrevious())
        {
            System.out.println(listIterator.previous());// Elements will be printed in reverse direction
        }
    }

}
