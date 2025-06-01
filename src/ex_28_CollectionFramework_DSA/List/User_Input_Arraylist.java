package ex_28_CollectionFramework_DSA.List;

import java.util.ArrayList;
import java.util.Scanner;

public class User_Input_Arraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Multiple inputs from the user and store them in separate
        // names, ages - store them

        ArrayList<String> names = new ArrayList();
        ArrayList<Integer> ages = new ArrayList();

        String ContinueInput = "Y"; //Control variable for input loop

        while (ContinueInput.equalsIgnoreCase("Y")) {
            System.out.println("Enter the name");
            String name = sc.next();
            names.add(name);


            System.out.println("Enter the age");
            Integer age = sc.nextInt();
            ages.add(age);

            sc.nextLine();
            System.out.println("Do you want to enter another record? (Y/N): ");
            ContinueInput = sc.nextLine();

        }

        for (Object o1 : names) {
            System.out.println(names);
        }

        for (Object o2 : ages) {
            System.out.println(ages);
        }
        sc.close();
    }
}
