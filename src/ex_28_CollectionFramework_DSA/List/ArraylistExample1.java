package ex_28_CollectionFramework_DSA.List;

import java.util.ArrayList;
import java.util.List;

public class ArraylistExample1 {
    public static void main(String[] args) {
        List list=new ArrayList();
        //List list=new ArrayList(10);-> Declaring Arraylist with InitialCapacity

        // InitialCapacity of Arraylist is 10 the moment when you reaches 9 Arraylist will
        // automatically grow to 20.

        list.add("1"); // 0 index
        list.add("2"); // 1 index
        list.add("3"); // 2 index
        list.add("3"); // 3 index
        list.add("4");// Duplicate elements are allowed // 4 index
        list.add("true");// Different datatypes are allowed // 5 index

        System.out.println(list.size());// 6 will be printed
        System.out.println(list.isEmpty());// false
        System.out.println(list.contains("1"));// true
        System.out.println(list.contains(1));// false because it does not contains Integer 1
        // Returns the index of the first occurrence of the specified element in this list,
        System.out.println(list.indexOf("3"));// 2 will be printed
        System.out.println(list.lastIndexOf("3")); // 3 will be printed
        System.out.println(list);

        System.out.println("-----");

        //Using for loop printing the list
        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }

        list.clear();// Everything will be cleared
        System.out.println(list);

    }
}
