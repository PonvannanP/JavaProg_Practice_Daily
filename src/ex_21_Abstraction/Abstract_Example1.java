package ex_21_Abstraction;

public class Abstract_Example1 {
    public static void main(String[] args) {
        //child c1=new child();
        //c1.loan50k();
        //c1.loan25k();

        //Father f1=new Father();// Since Father is an abstract class which is Incomplete
        // class Father cannot have an object i.e: abstract class should not have object

        //Father f2=new child();// while child is getting borned father is present eventhough
        // Father is a abstract class this is allowed


    }

}

abstract class Father {
    abstract void loan50k();// Father has a taken a loan of 50K and it is not given by
    // father which is Incomplete method

    void loan25k() {
        System.out.println("Given 25K");//Complete method
    }
}

//abstract class child extends Father// since child is extending father child has to pay the loan
    // since father is a abstract class child should also be abstract class







