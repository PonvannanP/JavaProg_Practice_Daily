package ex_10_String;

public class String_Immutable_Example2 {
    public static void main(String[] args) {
        String s1="hello";
        s1=s1.concat("world");// concat add the values
        System.out.println(s1);
    }
}
