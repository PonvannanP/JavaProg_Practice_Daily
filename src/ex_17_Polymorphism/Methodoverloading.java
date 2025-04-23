package ex_17_Polymorphism;

public class Methodoverloading {
    public static void main(String[] args) {
        MathOperations m1=new MathOperations();
        int r1=m1.add(3,4);// It will match the first function
        int r2=m1.add(3,4,6); // It will match the second function
        double r3=m1.add(3.14,5.26); // It will match the third function

    }
}

class MathOperations
{
    // In the same class, when you have with same name but different arguments
    // and different return type

    int add(int a,int b)
    {
        return a+b;
    }

    int add(int a, int b, int c)
    {
        return a+b+c;
    }
    double add(double a, double b)
    {
        return a+b;
    }
}
