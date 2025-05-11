package ex_23_Static;

public class Static_real_Example {
    public static void main(String[] args) {

        System.out.println(ATB.Coursename);// Without creation of object we can call because
        // it is static
        System.out.println(ATB.mentor); // Without creation of object we can call because
        // it is static

        ATB.doAssingment(); // Without creation of object we can call because it is static
        ATB.joinZoomclass(); // Without creation of object we can call because it is static


        ATB pon=new ATB();
        pon.setName("Ponvannan");
        pon.setPhoneno("9940564032");
    }


}

class ATB
{
static
{
    System.out.println("Whenever class is loaded static block will be called");
}
    {
        System.out.println("IIB is called when object is created");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

    private String phoneno;
    static String Coursename="ATB11x";// common across all members
    static String mentor="Pramod"; // common across all members

    static void doAssingment()
    {
        System.out.println("Do, Assignment"); // common across all members
    }

    static void joinZoomclass()
    {
        System.out.println("Class Joined"); // common across all members
    }

    void howTheyAssignment()
    {
        System.out.println("It is different!");
    }


}
