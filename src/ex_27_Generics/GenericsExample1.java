package ex_27_Generics;

public class GenericsExample1 {
    public static void main(String[] args) {
        temp_sum(3,4);
        temp_sum(3.14,4.14);
        temp_sum("Pon","Raj");

    }
      // Method Overloading
    //static int temp_sum(int a, int b){// we are using because not to create object
        //return a+b;
    //}

    //static double temp_sum(double a, double b){// we are using because not to create object
        //return a+b;
    //}

    //static String temp_sum(String a, String b){// we are using because not to create object
        //return a+b;
    //}

    // Generics

    static <T> T temp_sum(T a, T b){// we are using because not to create object
        System.out.println(a);
        System.out.println(b);
        return null;
        // whenever we use pass integer value T will recognize it as a Integer value
        // whenever we use pass double value T will recognize it as a double value
        // whenever we use pass String value T will recognize it as a String value
        // You can use anything example: T, R, Pon
    }

}
