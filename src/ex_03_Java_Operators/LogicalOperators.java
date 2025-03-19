package ex_03_Java_Operators;

public class LogicalOperators {
    public static void main(String[] args) {
        int data=20;
        int date=34;
        System.out.println(data>date&&data<date);// AND operator if anyone condition is false
        //it will print the statement as false

        boolean b=true;
        boolean c=true;
        System.out.println(!b);// it will print false when ! Operator is used
        System.out.println(!c);// it will print false when ! Operator is used

        int age=35;
        int age1=45;
        System.out.println(age>age1||age<age1);// OR operator if anyone condition is false
        //it will print the statement as true
    }
}
