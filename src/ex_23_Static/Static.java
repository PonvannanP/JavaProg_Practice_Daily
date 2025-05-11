package ex_23_Static;

public class Static {
    public static void main(String[] args) {
        A ref=new A(10);
        ref.displayvalue(); // 10 value will get displayed
        //System.out.println(ref.b);// 20 value will be seen because variable b is static
        //in nature(Static means that is shared among all the instances)
        System.out.println(A.b);// 20 will be printed because static means using the classes
        // Using the class we are calling the variable
        A.b=45;
        System.out.println(A.b);// now 45 will be printed because b value is changed to 45


        System.out.println("-----");

        A ref1=new A(20);
        ref1.displayvalue();// now 20 value will get displayed
        //System.out.println(ref1.b);// 20 value will be seen because variable b is static
        //in nature(Static means that is shared among all the instances)
        System.out.println(A.b);// 20 will be printed because static means using the classes
        // Using the class we are calling the variable

        // now 45 will be printed because b value is changed to 45

        A ref2=new A(30);
        System.out.println(A.b);// 45 will be printed because b value is changed to 45



    }

}

class A
{
    int a;// non-static/Instance variables/data members
    static int b=20;// static variable

    A(int a) //Parameter Constructor
    {
        this.a=a;
    }

    void displayvalue()
    {
        System.out.println(this.a);
    }
}
