package ex_17_Polymorphism;

public class Example1_MethodOverloading {
    public static void main(String[] args) {
        Home h1=new Home();
        h1.task(3);
        h1.task(2,6);
        h1.task(3,4,5);
    }
}

class Home
{
    void task(int a)
    {
        System.out.println(a);
    }
    void task(int a, int b)
    {
        System.out.println(a+b);

    }
    void task(int a,int b, int c)
    {
        System.out.println(a+b+c);
    }
}

