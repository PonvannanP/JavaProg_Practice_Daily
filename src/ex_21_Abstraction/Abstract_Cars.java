package ex_21_Abstraction;

public class Abstract_Cars {
    public static void main(String[] args) {
        WagonR car=new WagonR();
        car.drive();
    }

}

abstract class Engine
{
    abstract void startEngine();// abstract method
    abstract void stopEngine();// abstract method

    void normal()
    {
        System.out.println("Normal method");
    }

}

class WagonR extends Engine
{
    @Override
    void startEngine() {
        System.out.println("Starting the Engine");
    }

    @Override
    void stopEngine() {
        System.out.println("Stopping the Engine");
    }

    void drive()
    {
        startEngine();
        stopEngine();
    }
}