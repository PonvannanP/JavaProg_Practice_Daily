package ex_28_CollectionFramework_DSA.List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedlistPart2 {
    public static void main(String[] args) {
        List mylist = new ArrayList(5);// InitialCapacity can be provided
        List mylist0 = new ArrayList(); // // Arrays are stored in Continuous memory


        List mylist2 = new LinkedList(); // Doubly Linked List(Linkedlist is stored in Linkedlist manner)

        mylist2.add("Pramod");
        mylist2.add("Dutta");
        mylist2.add("Amit");
        mylist2.add("meenu");
        mylist2.add("ritwik");
        mylist2.add("ritwik");//Duplicates is allowed
        mylist2.add(null);// null is allowed
        mylist2.add(true);// Different data type is allowed
        mylist2.add(123);
        System.out.println(mylist2);

        System.out.println(mylist2.isEmpty());
        System.out.println(mylist2.size());
        System.out.println(mylist2.contains("Dutta"));
        System.out.println(mylist2.indexOf("Dutta"));

    }
}
