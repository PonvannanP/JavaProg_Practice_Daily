package ex_25_WrapperClass;

public class WrapperExample3 {
    public static void main(String[] args) {
        int a=10;// Primitive(No object and Behaviors)
        Integer b=a; // This is Boxing -> automatically JVM will store the value of
        // primitive to wrapper -> AutoBoxing
        System.out.println(b.intValue());// Behaviour is still there
        System.out.println(Integer.MIN_VALUE); // Behaviour is still there

        Integer a2=42; // Wrapper class
        int v = a2; // Unboxing -> wrapper is removed, this means attribute and behaviour is lost.
        System.out.println(v);
    }
}
