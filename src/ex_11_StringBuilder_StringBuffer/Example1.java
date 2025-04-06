package ex_11_StringBuilder_StringBuffer;

public class Example1 {
    public static void main(String[] args) {
        // String will be used 90%

        //Strings can be created in two ways
        String s1="Raja";
        String s2=new String("Raja");


        StringBuffer stringBuffer=new StringBuffer("Raja");
        StringBuilder stringBuilder=new StringBuilder("Raja");

        System.out.println(s1);// Raja will be printed
        System.out.println(s2); // Raja will be printed
        System.out.println(stringBuffer); // Raja will be printed
        System.out.println(stringBuilder); // Raja will be printed

        // There is no difference they will print the same output
        // Four types of string are presented

    }
}
