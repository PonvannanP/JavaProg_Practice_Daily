package ex_28_CollectionFramework_DSA.Set;

import java.util.*;

public class Example_Hashset_LinkedHashset_Treeset {
    public static void main(String[] args) {
        Set<String> hs=new HashSet();// only Strings are allowed
        // Hashing mechanism to store the element
        // no order.
        // no duplicates

        hs.add("Apple");
        hs.add("Orange");// No order is maintained
        hs.add("Watermelon");
        hs.add("Watermelon");// no duplicates are allowed
        // hs.add("123");// integer is not allowed
        hs.add(null);//
        hs.add(null);// one Null is allowed
        System.out.println(hs);
        System.out.println("------------");

        //For each loop
        for(String s:hs)
        {
            System.out.println(s);// You can fetch the Element by using for each loop
        }

        System.out.println("--------");

        // Iterator
        Iterator iterator= hs.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

        Set lhs=new LinkedHashSet();
        // LinkedList mechanism to store the element,
        // order will maintain, no duplicates

        lhs.add("Dpple");
        lhs.add("apple");
        lhs.add("Orange");
        lhs.add("WaterMelon");
        lhs.add("WaterMelon");// Duplicates are not allowed
        lhs.add(null);
        System.out.println(lhs);// order will be maintained
        System.out.println(lhs.isEmpty());
        System.out.println(lhs.contains("Apple"));
        System.out.println(lhs.size());

        System.out.println("--------");

        Set ts=new TreeSet();
        // Black and Red Tree mechanism to store the element.
        // order will maintain, Natural Sorting is done.
        // Natural Sorting - comes from ASCII values.

        ts.add("Dapple");
        ts.add("Apple");
        ts.add("apple");
        ts.add("Orange");
        ts.add("WaterMelon");
        //ts.add("123");// java.lang.ClassCastException
        // sorting will not happen with combination of String and Integer

        //ts.add(null);// java.lang.NullPointerException
        // If you add null then it is not possible to sort

        System.out.println(ts);// sorting is done automatically

        System.out.println("---For each loop---");

        for(Object o:ts)
        {
            System.out.println(o);
        }

        


    }
}
