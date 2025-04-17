package ex_15_Constructors;

public class Oops_Constructor {
    public static void main(String[] args) {
        Baby b1 = new Baby();
        new Baby();// two times the default Constructor will be called
        Baby b2;// No Constructor is called because no object is created only reference is available


    }
}

    class Baby
    {
       // Attribute/Instance variables/Data members/member variables
        String name;

        // Behaviour
        void cry()
        {
            System.out.println("Cry");
        }
        void sleep()
        {
            System.out.println("sleep");
        }
        void eat()
        {
            System.out.println("eat");
        }

        Baby()// Default Constructor
        {
            System.out.println("I am Called, Default Constructor"); // Whenever a object is created
            // Default Constructor will be called automatically
        }


    }

