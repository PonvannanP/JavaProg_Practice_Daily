package ex_22_IIB;

public class IIB_Example {
    //...
    // Instance Intialization Block
    // I will be executed when object is created
    //...

    public static void main(String[] args) {
        A obj1=new A();// pnce object is created automatically IIB block will be called

    }
}

class A {

// IIB will be exceuted first
    {
        System.out.println("I am IIB");
    }
        //when IIB is called
        //System.out.println("If you want to call something when object is created");
        // mysql connection
        // read a CSV file, xlsx file
        // read a json, xml file
        // read a text file or env file

        // You can use N number of IIB's
        {
            System.out.println(" I am IIB2");

        }

        // But you can have only one Default Constructor
        A()
        {
            System.out.println("Default Constructor");
        }



    }

