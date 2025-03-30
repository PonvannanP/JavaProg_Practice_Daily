package ex_06_IncrementDecrement;

public class Task_Increment_Decrement {
    public static void main(String[] args) {
        int a=20;
        System.out.println(--a + a++ + a--);
        System.out.println(a);

//        A->--a, B->a++, C->a--
//        A->--a, Exp A->19, a->19
//        +
//        B->a++, Exp B->19, a->20
//        +
//        C->a--, Exp C->20, a->19
//        Exp A+Exp B+Exp C->19+19+20->58
//        a->19
    }
}
