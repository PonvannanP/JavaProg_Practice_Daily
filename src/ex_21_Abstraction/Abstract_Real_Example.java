package ex_21_Abstraction;

public class Abstract_Real_Example {

}

abstract class Employee {
    private String name;
    private String address;
    private int number;

    Employee()// DC
    {

    }

    Employee(String name, String address, int number)// PC
    {
        this.name = name;
        this.address = address;
        this.number = number;
    }

    abstract double computepay();// abstract method

    void mailCheck()// Normal method
    {
        System.out.println("Mail" + "check");

    }


}
// Concrete class
class C1 extends Employee// This C1 class will hide the Employee class
    {
        @Override
        double computepay() {// C1 xlass completes the implementation of computepay function
            return 0;
        }
    }


