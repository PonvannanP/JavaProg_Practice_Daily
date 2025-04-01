package ex_10_String;

public class String_Inv4 {
    public static void main(String[] args) {
        String s1="Hello";
        String s2="Hello";
        String s3=new String("Hello");
        System.out.println(s1==s2);// True
        System.out.println(s2==s3);//false
        System.out.println(s1.equals(s3));//True
    }
}
