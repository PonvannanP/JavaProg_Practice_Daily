public class ParameterConstructor {
    public static void main(String[] args) {
        Car c1=new Car();
        c1.name="Telsa";
        System.out.println(c1.name);// null will be printed if there is no Constructor declared
        System.out.println(c1.year);// 0 will be printed if there is no Constructor declared
        System.out.println(c1.model);// null will be printed if there is no Constructor declared

        System.out.println("-----");


        Car c2=new Car();
        System.out.println(c2.name);// same value i.e. Unknown car will be printed
        System.out.println(c2.year);//same value i.e.1996 will be printed
        System.out.println(c2.model);// same value i.e.xxx will be printed


    }
}
class Car
{
    String name;
    int year;
    String model;

    Car()
    {
        // Default Constructor will give you the initial value for all the attributes
        name="Unknwn Car";
        year=1996;
        model="xxx";
    }

}
