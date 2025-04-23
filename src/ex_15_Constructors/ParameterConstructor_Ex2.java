package ex_15_Constructors;

public class ParameterConstructor_Ex2 {
    public static void main(String[] args) {


        Person p2 = new Person("Pon", 787544, "ABC");
        Person p3 = new Person("Pen", 12345, "CBA");
        Person p4=new Person();

        p2.eat();//Pon will be Printed
        p3.eat();//Pen will be Printed
        p4.eat();// null will be printed because there is no value 
    }
}
    class Person
    {
        String name;
        long phone;
        String address;


        Person()
        {

    }

    Person(String name_arg,long phone_arg,String address_arg)
    {
        this.name=name_arg;
        this.phone=phone_arg;
        this.address=address_arg;
    }

    void eat()
    {
        System.out.println(this.name+ " "+"is eating");
    }
}
