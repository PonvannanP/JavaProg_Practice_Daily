package ex_13_Whileloop;

import java.util.Scanner;

public class Fibonacc_Series {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number you want to check fibonacci Series");
        int n= scan.nextInt();


        long[]fib = new long[n];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i < n; i++) {
            fib[i]= fib[i-1] + fib[i-2]; // fib[i] value =

        }
        System.out.println("Fibonacci series up to="+n );
        for (int i = 0; i < n; i++) {
            System.out.print(fib[i]+" ");
        }
    }
}
