package ex_06_IncrementDecrement;

public class Increment_Example6 {
    public static void main(String[] args) {
        int a=20;
        System.out.println(++a + ++a);

        //A->++a, Exp A->21, a->21
        //+
        //B->++a, Exp B->22, b->22
        //Exp A+Exp B->21+22->43
    }
}
