package ex_20_Super;

public class Super_Example1 {
    public static void main(String[] args) {
        Car c1=new Car(10);
        c1.display();


    }

}

class Vehicle {
    public int maxSpeed = 180;

    Vehicle() {
        System.out.println("Default Const");
    }

    Vehicle(int a) {
        System.out.println("Param Con");
    }

    // Method Overloading - Same, same name function with different arguments.
    void message() {
        System.out.println("No Return, No Argument");
    }

    void message(int a) {
        System.out.println("PC - arguemnt");
    }

    void display()
    {
        System.out.println("Vehicle Parent");
    }
}

class Car extends Vehicle {

    // Encapsulation
    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    private int maxSpeed = 281;

// super concept+Constructor Overloading
    Car() {
        super(); // Default Constructor of Parent
    }

    Car(int a) {
        super(10);// Parameter Constructor of Parent
    }

    // Method Overloading
    // Polymorphism
    @Override
    void display() {
        // This keyword concept
        System.out.println(this.maxSpeed); // Car class speed can be accessed

        // Parent class
        System.out.println(super.maxSpeed); // Parent class Vehicle speed can be accessed
        // by using this keyword
        super.message();// Vehicle(Parent class) class function
        super.message(10);// Vehicle(Parent class) class function
        super.display();// Vehicle(Parent class) class function

        System.out.println("Override");// Overriding the Vehicle display function
    }
}






