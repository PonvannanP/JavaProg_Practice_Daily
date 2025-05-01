package ex_20_Super;

public class Super_Example2 {
}

class God
{
    void sound()
    {
        System.out.println("God sound");
    }
}

class Animal extends God
{
    protected String Color="White";

    void sound()
    {
        System.out.println("Animal sound");
        super.sound();// God class sound function will be called
    }

}
class Dog extends Animal
{
    private String Color="Black";

    void display()
    {
        System.out.println(this.Color);// Dog class Color will be called
        System.out.println(super.Color); // Animal class Color will be called
        super.sound();// Animal class sound function can be called
    }
}
