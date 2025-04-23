package ex_17_HierarchialInheritance;

public class Example1 {
    public static void main(String[] args) {
        Father f1=new Father();
        f1.home();// father can also use home function

        Son s1=new Son();
        s1.home(); // Son can also use home function

        Sister s2=new Sister();
        s2.home(); // Sister can also use home function
    }

}

class Father{
    void home()
    {
        System.out.println("Father Home");
    }
}

class Son extends Father
{
    void h2()
    {
        System.out.println("Son Home");
    }

}

class Sister extends Father
{
    void s2()
    {
        System.out.println("Sister Home");
    }
}
