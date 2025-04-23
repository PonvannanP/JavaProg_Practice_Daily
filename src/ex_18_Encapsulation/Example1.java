package ex_18_Encapsulation;

public class Example1 {
    public static void main(String[] args) {
        VMOlogin v1 = new VMOlogin("Raja", "Rajastr");
        System.out.println(v1.password);
        v1.password="Str_456";
        System.out.println(v1.password); // Allowing the attributes to change the password
        //this is not good practice

        GoodVMOlogin g1=new GoodVMOlogin("User","Pass");
        //System.out.println(g1.username);

        // System.out.println(g1.password);// this cannot be accessed because it is private it is
        // not accessed by other classes

    }
}

    class VMOlogin
    {

        // Attributes
        public String username;
        public String password;

        // Parameter Constructor
        VMOlogin(String usr, String pwd)
        {
            this.username=usr;
            this.password=pwd;
        }

    }

    class GoodVMOlogin
    {
        private String username;// access within the class
        private String password; // access within the class

        public GoodVMOlogin(String usr, String pwd)
        {
            this.username=usr;
            this.password=pwd;
        }
    }

