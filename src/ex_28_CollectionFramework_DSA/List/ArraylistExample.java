package ex_28_CollectionFramework_DSA.List;

import java.util.ArrayList;
import java.util.List;

public class ArraylistExample {
    public static void main(String[] args) {
        ArrayList a1=new ArrayList();
        a1.add("pramod");
        a1.add("null");
        a1.add("123");// Different data type is allowed
        a1.add("dutta");
        a1.add("dutta");// duplicate is allowed
        System.out.println(a1);
        System.out.println(a1.size());// size is a premade function available in Arraylist

        List l1=new ArrayList();// Dynamic Dispatch
        l1.add("123");
        l1.add("abc");
        System.out.println(l1);
        System.out.println(l1.isEmpty());// True

        List l2=new ArrayList();
        System.out.println(l2.isEmpty());// false
    }
}
