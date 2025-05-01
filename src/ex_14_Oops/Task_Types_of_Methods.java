package ex_14_Oops;

public class Task_Types_of_Methods {
    public static void main(String[] args) {
        Task_Types_of_Methods a12=new Task_Types_of_Methods();
                Ponvannan pq = new Ponvannan();
                pq.red();

    }

}

class Ponvannan
{
    String name;
   // int age;
    String address;
    boolean male;
    long phone;

    void red()
    {
        System.out.println("Name");

    }

    int trf(int age)
    {
        return age;
    }

    String  add(String address)
    {

        return address;
    }

    boolean gender()
    {
        return true;
    }

}
