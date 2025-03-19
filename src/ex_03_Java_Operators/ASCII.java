package ex_03_Java_Operators;

public class ASCII {
    public static void main(String[] args) {
        char a='A'; //ASCII-> 65
        char b='B'; //ASCII-> 66
        System.out.println(a+b);// char are integral data type so they will
        //return numbers

        System.out.println('A'==65);// it is true because ASCII value for A is 65
        System.out.println('B'==66);// it is true because ASCII value for A is 66

        short k=10;
        char z$='A';
        System.out.println(k+z$);// short value is 10 and it adds with z$ value is 65


    }
}
