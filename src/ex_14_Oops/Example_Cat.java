package ex_14_Oops;

public class Example_Cat
{
    public static void main(String[] args) {
        Cat c1=new Cat();// reference with object
        Cat c2;// only reference
        new Cat();// only object

        c1.running();
        //c2.running(); it will not be executed because no object is created inorder to call
        // the behaviour of the class we need to create an object


        new Cat().running();// running will be printed
        System.out.println(new Cat().name);// null will be printed because no object is created

    }
}

class Cat {
    String name; // null

    void running() {
        System.out.println("Running");
    }
}












