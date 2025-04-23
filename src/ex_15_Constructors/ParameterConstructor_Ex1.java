package ex_15_Constructors;

public class ParameterConstructor_Ex1 {
    public static void main(String[] args) {
        Car2 c1=new Car2();//Default Constructor will be called
        Car2 c2=new Car2();//Default Constructor will be called

        System.out.println(c1.name);// Unknown Car will be printed
        System.out.println(c2.name);// Unknown Car will be printed

        Car2 c3=new Car2("Model3",1908,"Tesla");
        System.out.println(c3.name);// Tesla will be printed

        Car2 c4=new Car2("mahindra",1908,"Scorpio");
        System.out.println(c4.name);//Scorpio will be printed

        Car2 c5=new Car2("gen",1906,"pio");
        System.out.println(c5.name);
    }


}

class Car2
{
    String name;
    String model;
    int year;

    // Default Constructor
    Car2()
    {
        model="XXX";
        year=1900;
        name="Unknown Car!";
        System.out.println("Default Constructor");

    }

    // Parameter Constructor
    Car2(String model_oc_arg,int year_oc_arg,String name_oc_arg)
    {
        this.name=name_oc_arg;
        this.year=year_oc_arg;
        this.model=model_oc_arg;

    }
}
