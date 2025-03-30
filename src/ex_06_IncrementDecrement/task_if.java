package ex_06_IncrementDecrement;

import java.util.Scanner;

public class task_if {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number");
        int number=sc.nextInt();
        System.out.println(number);
        if(number%2==0)
        {
            System.out.println("Even number");
        }
        else
        {
            System.out.println("Not an Even number");
        }
    }
}
