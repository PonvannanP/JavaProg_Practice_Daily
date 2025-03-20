package ex_04_TypeCasting;

public class Lab_01_TypeCasting {
    public static void main(String[] args) {
        byte a = 15; // widenning
        //int b = a;  implicit used to convert from small to big data tyoe -> byte to int
        int b= (int)a; // Explicit
        System.out.println(b);

        long num = 987654321l; //narrowing
       // int numb = num;// implicit will throw  error
        int number= (int) num; // explicit used to convert big data type to small-->  long into int
        System.out.println(number);
    }
}
