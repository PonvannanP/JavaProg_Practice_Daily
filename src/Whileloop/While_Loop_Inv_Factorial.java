package Whileloop;

import java.util.Scanner;

public class While_Loop_Inv_Factorial {
    public static void main(String[] args) {
        //Factorial Program
        Scanner scanner=new Scanner(System.in);// Gettiing an user input
        System.out.println("Enter the factorial you want!");
        int number=scanner.nextInt();

        int factorial=1; //The factorial calculation starts with 1,
        // which is correct since factorial of 0! = 1
        if(number<=0)// if user enters zero or less than equal to zero
            // which is less or equal to 0 then
            // value is 0 because zero factorial is one
        {
            System.out.println(factorial);// here we declaring factorial meaning
            // the factorial value is 1 when we are entering zero or less than value
            // of zero
        }
        else
        {
           for(int i=1;i<=number;i++)
           {
               factorial=factorial*i;//
           }
            System.out.println("Factorial is ->" +'\n' + factorial);
        }

    }
}
