package ex_06_IncrementDecrement;

public class PreIncrement_Example1 {
    //Value is incremented first and then stored in result
    public static void main(String[] args) {
        int a=10;
        int b=++a;
        System.out.println(b);
        System.out.println(a);

        //Expression and result table
        // Line no/a/result b
        // 8/10/NA
        //9/11/11
        //10/11(NA)/11
        //11/11/11(NA)

    }
}
