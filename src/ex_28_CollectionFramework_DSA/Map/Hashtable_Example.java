package ex_28_CollectionFramework_DSA.Map;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;

public class Hashtable_Example {
    public static void main(String[] args) {
        // Map - K, V,  null values allows

        // Hashtable - Synchronised, Slow and Legacy Class - Thread Safe
        // T1, T2 - they will use one by one.

        Hashtable<Integer, String> ht1 = new Hashtable();
        ht1.put(1, "one");
        ht1.put(1, "one");
        ht1.put(2, "two");
        ht1.put(3, "three");
        //ht1.put(4,"null");// Hashtable does not allow null values and it throws // java.lang.NullPointerException
        //ht1.put(null,"three"); // null key is also not allowed and it throws // java.lang.NullPointerException
        System.out.println(ht1);

        HashMap<Integer, String> ht2 = new HashMap<>();
        // Not Thread Safe, or Not Synchronised
        ht2.put(1, "one");
        ht2.put(2, "two");
        ht2.put(3, "three");
        ht2.put(3, null);// null value is allowed
        ht2.put(null, null);// null key is allowed
        System.out.println(ht2);

        System.out.println("  ---- ");

        // Iterate over the Hashtable using Enumeration

        Enumeration<Integer> e = ht1.keys();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());

        }
    }
}
