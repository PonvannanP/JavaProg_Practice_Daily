package ex_28_CollectionFramework_DSA.List;

import java.util.ListIterator;
import java.util.Vector;

public class Vector_ListIterator {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();
        v.add("Item1");
        v.add("Item2");
        v.add("Item3");
        v.add("Item4");
        v.add("Item5");

        ListIterator listIterator=v.listIterator();
        //reference contains listIterator

        while(listIterator.hasNext())
        {
            System.out.println(listIterator.next());// Items will be printed in forward direction
        }

        System.out.println("----Previous");

        while(listIterator.hasPrevious())
        {
            System.out.println(listIterator.previous()); // Items will be printed in reverse order
        }
    }
}
