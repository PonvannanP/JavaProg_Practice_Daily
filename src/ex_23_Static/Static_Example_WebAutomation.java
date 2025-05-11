package ex_23_Static;

public class Static_Example_WebAutomation {
    public static void main(String[] args) {
        Automation t1 = new Automation();
    System.out.println(Automation.driver);

    Automation t2 = new Automation();
    Automation t3 = new Automation();

        System.out.println(t2.driver);// chrome will be called
        System.out.println(t3.driver); // chrome will be called



}


}

class Automation{
    static String driver = "Chrome";
}
