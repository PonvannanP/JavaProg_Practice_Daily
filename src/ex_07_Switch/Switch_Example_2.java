package ex_07_Switch;

import java.util.Scanner;

public class Switch_Example_2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);//Scanner option
        System.out.println("Enter the day num 1 to 7");
        int days=scanner.nextInt();
        System.out.println(days);

        switch(days)
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thur");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
                //If there is no default statement and no ouput matches then nothing
            //will execute






    }

}
    }

