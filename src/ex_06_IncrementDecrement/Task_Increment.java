package ex_06_IncrementDecrement;

public class Task_Increment {
    public static void main(String[] args) {
        int a=10;
        System.out.println(++a  + a++ + a++);
        System.out.println(a);

//        A->++a B->a++ C->a++
//        A->++a ExpA->11 a->11
//        +
//        B->a++ ExpB->11 a->12
//        +
//        C->a++ ExpC->12 a->13
//        Exp A+Exp B+ExpC->11+11=12->13



    }
}
