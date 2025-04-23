package ex_16_Inheritance;

public class SingleInheritance {
    public static void main(String[] args) {
        Father f1 = new Father();
        System.out.println(f1.gold_f);
        f1.bhk();

        Son s1 = new Son();
        s1.bhk1();
        // Father Attributes and behaviour
        System.out.println(s1.gold_f);
        s1.bhk();


    }
}

    class Father
    {
        int gold_f=1000;//Attributes/Properties/Instance variables

        void bhk()// Behaviour/Data members/ Functions
        {
            System.out.println("Father -2BHK");
        }
    }

    class Son extends Father// Father code will be available in son
    {
        int gold_f=1000;//Attributes/Properties/Instance variables

        void bhk()// Behaviour/Data members/ Functions
        {
            System.out.println("Father -2BHK");
        }
        void bhk1()
        {
            System.out.println("3BHK-Son");
        }
    }

