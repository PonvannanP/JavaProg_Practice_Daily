package ex_05_TC;

public class WideningTypeCasting {
    public static void main(String[] args) {
        byte b=13;
        int a=b;
        // Widening converting a smaller data type to a larger one
        // Implicit widening is done automatically by JVM
        System.out.println(b);// Implicit widening will convert the byte data type to int

        byte c=23;
        int d=(int)c;// Explicit widening is not required
        // Bracket means telling the JVM to convert to int
        System.out.println(c);// Explicit widening will convert the byte data type to int

    }



}
