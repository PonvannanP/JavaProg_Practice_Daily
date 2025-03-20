package ex_05_TC;

public class NarrowingTypecasting {
    public static void main(String[] args) {
        //int a=24;
        //byte b=a;// this is invalid incase of Narrowing Implicit concept is not allowed
        // putting the big data type to smaller one
        //System.out.println(b);

        int a=400;// 400 will be converted to byte code->110010000 total 9 digits
        //byte have only 8 bits to store so they take--> 10010000--> only last 8 digits
        // they convert into a decimal number and store into byte
        //Because of 1 starting in binary number it will give the negative number as output -112
        // If it is starting as 0 in binary number it will give the Positive number as Output

        byte b=(byte)a;// this is valid incase of Narrowing Explicit concept is allowed
        // putting the big data type to smaller one but there will be a data loss
        System.out.println(a);




    }
}
