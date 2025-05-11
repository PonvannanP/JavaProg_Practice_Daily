package ex_23_Static;

public class Static_Example2 {
    public static void main(String[] args) {
        B.commontoAll();// without creating object we can call commontoAll function
        System.out.println(B.b);// using the class name we are calling variable b because it
        // is static

        B ref_b=new B();
        ref_b.display();// non-static class so we are calling with creating an object using reference
        // variable
        System.out.println(ref_b.a);
    }


}

class B
{
    static
    {
        System.out.println("SIB is called once, when class is loaded");
    }

    int a=10;// non-static variable
    static int b=20;// static variable

    void display()
    {
        System.out.println(b);
        System.out.println("Non static function");
    }

    static void commontoAll()
    {
        // System.out.println(a);// Cannot call instance variable or Non-static variable in
        // static method
        System.out.println("static");
    }

    //static class C
    //{
        // Not useful not going to use static class
    //}

}
