package ex_19_AccessModifiers;

public class Example1 {

}

class A
{
    protected int gold=10;
}

class B extends A
{
    void getGold()
    {
        System.out.println(gold);   // private variables are not inherited
    }
}
