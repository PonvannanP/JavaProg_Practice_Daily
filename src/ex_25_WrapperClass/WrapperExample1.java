package ex_25_WrapperClass;

public class WrapperExample1 {
    public static void main(String[] args) {
        int a=10;// primitive
        // This is not object
        // No attributes and Behaviours
        // Java likes Object and classes

        // char,float,byte,long,float,double- we will avoid them now

        // We will use the Wrapper class
        // Character, Byte, Short, Integer, long, Double, Float

        Integer age=45;
        System.out.println(Integer.MIN_VALUE);// Min value will be printed
        System.out.println(Integer.MAX_VALUE);// Max value will be printed
        System.out.println(age);// age value will be printed
        System.out.println(age.intValue());// age integer value will be printed

    }
}
