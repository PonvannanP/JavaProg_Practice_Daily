package ex_10_String;

public class String_Inv2 {
    public static void main(String[] args) {
        String s1="Cric";// s1 is stored in String constant Pool
        String s4="Cric";// s4 is stored in String constant Pool
        String s10="Cric";// s10 is stored in String constant Pool
        // Totally 1 string is present String constant Pool which is "Cric" and
        // s1,s4,s10 will points to the same String values which is "Cric"

        String s2=new String("Cric");
        String s6=new String("Cric");
        String s3=new String("Cric");
        // Now three String is presented because new keyword will create a seperate seperate
        // memory in Heap object area


    }
}
