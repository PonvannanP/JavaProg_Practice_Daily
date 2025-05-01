package ex_18_Encapsulation;

public class Example1 {
    public static void main(String[] args) {
        VMOlogin v1 = new VMOlogin("Raja", "Rajastr");
        System.out.println(v1.password);
        v1.password="Str_456";
        System.out.println(v1.password); // Allowing the attributes to change the password
        //this is not good practice i.e: Allowing your Childrens to interact with Strangers

        GoodVMOlogin g1=new GoodVMOlogin("User","Pass");
        //System.out.println(g1.username);

        // System.out.println(g1.password);// this cannot be accessed because it is private it is
        // not accessed by other classes never allowed our attributes to access outside

        //g1.setusername("Raja");// You can change the Username and access the username
        //System.out.println(g1.getusername());

        System.out.println(g1.getPassword());
        g1.setPassword("12345",true);
        System.out.println(g1.getPassword());



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

    // Encapsulation concept

    class GoodVMOlogin
    {
        private String username;// access within the class

        public String getPassword() {
            return password;
        }

        public void setPassword(String password,boolean isAdmin) {
            if(isAdmin)
                this.password = password;// if it is Admin you can see the password
            // not allowed to change the password
        }
        //else
        {
            //System.out.println("Not allowed to change the password");
        }//

        private String password; // access within the class

        public GoodVMOlogin(String usr, String pwd)
        {
            this.username=usr;
            this.password=pwd;
        }


    }

