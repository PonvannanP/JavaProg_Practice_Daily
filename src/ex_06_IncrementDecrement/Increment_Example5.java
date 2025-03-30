package ex_06_IncrementDecrement;

public class Increment_Example5 {
    public static void main(String[] args) {
        int a=10;
        System.out.println(a++ + ++a);
        //A+B
        //A->a++ ->Expression A->10,a=11(after this a value will be increased)
        //+
        //B->a ->Expression B->11, a=11
        //A+B->Expression A+Expression B->10+11
        //Output is 21

        //Line no|a|Expression
        //5|10|NA
        //6|11|10+11->21
    }
}
