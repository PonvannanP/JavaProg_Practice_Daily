package ex_05_TC;

import java.util.Scanner;

public class NestedTernary {
    public static void main(String[] args) {
        int age=20;
        //result=condition? expression1:expression2
        //Expression 1 can be written as(Condition?"True":"False"):expression 3
        String result=age>20?(age<20?"True":"false"):"neutral";
        System.out.println(result);

        Scanner scan = new Scanner(System.in);
        int result1 = scan.nextInt();


    }
}
