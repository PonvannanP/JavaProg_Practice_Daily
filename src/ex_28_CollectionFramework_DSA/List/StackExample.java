package ex_28_CollectionFramework_DSA.List;


import java.util.Stack;

public class StackExample {


    public static void main(String[] args) {
        // Stack
        // List In -> First Out ( LIFO)
        //Stack s=new Stack();


//        s.add("Pramod");
//        s.add("Dutta");
//        System.out.println(s);

        Stack s=new Stack();
        // push is adding the elements(pushing the elements one by one)
        s.push("Pramod");
        s.push("Dutta");
        s.push("Amit");
        s.push("Amit2");
        System.out.println(s);

        System.out.println(s.size());
        System.out.println(s.peek());// peek is seeing the last element in the stack
        System.out.println(s);

        System.out.println(s.pop());// pop will remove the element in the stack
        System.out.println(s);
        s.add("Chetan");
        s.add("Chetan");
        s.push("Vijay");
        System.out.println(s);

    }
}



