package ex_03_Java_Operators;

public class Concat {
    public static void main(String[] args) {
        String s1="raja";
        String s2="ravi";
        System.out.println(s1+s2);// it will add two string values

        String sa1="ra";
        String sa2="ri";
        int a=5;
        int b=10;
        System.out.println(sa1+sa2+a+b);// It will add String sa1 and sa2 but it will
        //not add a and b because initially  it is a String so it will consider remaining things
        //as a String

        System.out.println(a+b+sa1+sa2);// In this statement first int is present so it will add a and b
        //and string will not have mathematical operation so only concentation will happen on String

        System.out.println(sa1+sa2+(a+b));// BODMAS Operation is performed if we use bracket it
        //will add a and b

    }
}
