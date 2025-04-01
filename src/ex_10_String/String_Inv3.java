package ex_10_String;

public class String_Inv3 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s4 = "Hello";
        // Total no of Strings present in String Constant Pool is 1

        String s2 = new String("Hello");
        String s3 = new String("Hello");
        String s6 = new String("hello");

        // Total no of Strings present in String Heap object area is 3

        // '==' Operator is used for Comparison but incase of String it checks the location reference

        System.out.println(s1 == s3);// Returns false because s1 is stored in one location
        //and s3 in another location(one is stored in String constant Pool and another is
        //stored in Heap object area)
        System.out.println(s1 == s2);// Returns false because s1 is stored in one location
        //and s2 in another location(one is stored in String constant Pool and another is
        //stored in Heap object area)
        System.out.println(s2 == s3);//Returns false because s2 is stored in one location
        //and s3 in another location in Heap object area
        System.out.println(s1 == s4);// Returns True because s1 and s4 points to same String value
        // in String constant Pool
        System.out.println(s3 == s6);//Returns false because s3 is stored in one location
        //and s6 in another location in Heap object area

        System.out.println(s1.equals(s2));// Returns true because both the contents in s1
        // and s2 are same
        System.out.println(s3.equalsIgnoreCase(s6));// Returns true because it Ignores the
        // Capital case that is it can be anything like Hello,hello,HELLO,heLlo,HellO.

        //Conclusion is:
        // ==-> checks for location reference
        // =-> assignment the value


    }
}
