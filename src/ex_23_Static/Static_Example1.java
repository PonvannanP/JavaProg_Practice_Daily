package ex_23_Static;

public class Static_Example1 {
    public static void main(String[] args) {
        P obj=new P();
        // P-> Class obj-> reference variable, new P()-> object
        // whenever the class is called static will be called and whenever the object is
        // called SIB and IIB will be called

        P obj1=new P();
        P obj2=new P();



        // When you create more objects IIB and DC will be called but static will be called
        // only once because class is called once(In one class we are creating many objects)


    }


}

class P
{
    {
        System.out.println("IIB");
    }

    P()
    {
        System.out.println("Default Constructor");
    }
    static
    {
        System.out.println("SIB");
    }


}
