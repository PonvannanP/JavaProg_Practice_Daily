package ex_11_StringBuilder_StringBuffer;

import java.util.Scanner;

public class Example5_Palindrome {
    public static void main(String[] args) {
        // Palindrome is madam when we reverse it will be same as madam
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the input, and I will check palindrome");
        String UserInput=sc.next();
        String newUserInput=reverseString(UserInput);// NewUserInput should be reverse
        // of already the input which is get

        if(newUserInput.equalsIgnoreCase(UserInput))// It will ignores the case
            // sensitive
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("It is not a Palindrome");
        }

    }

    private static String reverseString(String UserInput) {// reverseString is a function
        String reversed="";// reveresed empty one
        for(int i=UserInput.length()-1;i>=0;i--)
        {
         reversed=reversed+UserInput.charAt(i);// charAt(i) reprsents the index of the string
            // first it will go charAt(5), then charAt(4), then charAt(3)

        }
        return reversed;
    }
}
