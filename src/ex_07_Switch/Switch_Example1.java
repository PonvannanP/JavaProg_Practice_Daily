package ex_07_Switch;

import java.util.Scanner;

public class Switch_Example1 {
    public static void main(String[] args) {
        //Switch

        // Take a user input and tell them the day which they have told
        // 1 to 7-> 1->mon, 2->tue, 3->wed, 4->thur, 5->fri, 6->sat, 7->sun

//        int day=Integer.parseInt(args[0]); //CLI Option

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
            default:
                System.out.println("Invalid day");
                break;
                //If there is no break then everything will get execute
        }





    }

}
