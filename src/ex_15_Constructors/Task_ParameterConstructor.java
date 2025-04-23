package ex_15_Constructors;

public class Task_ParameterConstructor {
    public static void main(String[] args) {
        Pers p1=new Pers();
        Pers p2=new Pers("Raja",23,"abc",956434l,true);
        System.out.println(p2.name);

        p1.eat();
        p2.eat();



    }
}

class Pers
{
    String name;
    int age;
    String address;
    long phone;
    boolean isMale;

    Pers()
    {
        //System.out.println("Default Constructor a Person!..");
    }

    Pers(String name_arg,int age_arg, String address_arg, long phone_arg, boolean isMale_arg)
    {
        this.name=name_arg;
        this.age=age_arg;
        this.address=address_arg;
        this.phone=phone_arg;
        this.isMale=isMale_arg;

    }

    void eat()
    {
        System.out.println(this.name+ " is " +"eating");
    }
    void sleep()
    {
        System.out.println("Sleeping");
    }
    void walk()
    {
        System.out.println("Walking");
    }
    void doHome()
    {
        System.out.println("Homework");
    }


}
