package ex_06_IncrementDecrement;

import java.util.Scanner;

public class task_If_Triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of the Triangle: ");
        int a=sc.nextInt();
        System.out.println(a);
        System.out.println("Enter the value of the Triangle: ");
        int b=sc.nextInt();
        System.out.println(b);
        System.out.println("Enter the value of the Triangle: ");
        int c=sc.nextInt();
        System.out.println(c);

        //int a=Integer.parseInt(args[0]);
        //System.out.println(a);

        //int b=Integer.parseInt(args[1]);
        //System.out.println(b);

        //int c=Integer.parseInt(args[2]);
        //System.out.println(c);

        if(a==b&&a==c)
        {
            System.out.println("Equivalent Triangle");
        }
        else
        {
           if(a==b||a==c)
           {
               System.out.println("Isoclese Traiangle");
           }
           else
           {
               System.out.println("Scalene Traiangle");

           }
        }

    }
}
