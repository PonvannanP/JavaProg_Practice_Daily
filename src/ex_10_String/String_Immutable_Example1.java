package ex_10_String;

public class String_Immutable_Example1 {
    public static void main(String[] args) {
        String name="raja";
        name.toUpperCase();// each character becomes uppercase now
        System.out.println(name);// Now both the values will be stored in StringconstantPool
        // one is raja and another is RAJA but the variable name still points to the
        // older one raja name.toUppercase() only converts the String to Uppercase
        // but the variable name still points to the raja
    }
}
