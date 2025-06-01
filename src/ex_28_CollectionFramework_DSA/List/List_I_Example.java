package ex_28_CollectionFramework_DSA.List;


import java.util.ArrayList;
import java.util.List;

public class List_I_Example {
    public static void main(String[] args) {
        //List fruits=new List; // //List is an Interface so no object creation  is possible in LIST {
        //}

        List fruits=List.of("orange","apple","banana","mango","watermelon");
        // Without using the object reference by using only the class name(Interface) we are able to create
        // an function(of function) because you can have static function in the Interface this is the new
        // concept introduced in Java 13 that Interface can have static function which is complete function

        System.out.println(fruits);
        fruits.add("chiku");// you cannot add because List.of is an static function which is cannot changed
        // you will get java.lang.UnsupportedOperationException error because in List Inteface 'add' is
        // an incomplete function that the reason we are getting this error

        List l = new ArrayList(); // Dynamic Dispatch
        ArrayList l2 = new ArrayList();// Arraylist is an Concrete class which implements List Inteface
        // Under List Interface Arraylist will come
        l.add("hello");
        l.add(123);
        l.add(true);
        l.add("Blah Blah");



    }
}

