package ex_21_Abstraction;

public class Abstract_Interfaces1
{
    public static void main(String[] args) {
        Car c1=new Car();
        c1.drive();
    }

}

class Car implements Brake,Engine1
{

    void drive()
    {
        startEngine();
        stopEngine();
        applyBreak();
    }
    @Override
    public void applyBreak() {

    }

    @Override
    public void startEngine() {

    }

    @Override
    public void stopEngine() {

    }


}

interface Brake
{
    void applyBreak();

}

interface Engine1
{
    void startEngine();
    void stopEngine();
    default void test()
    {
        System.out.println("Concrete complete");
    }

}

