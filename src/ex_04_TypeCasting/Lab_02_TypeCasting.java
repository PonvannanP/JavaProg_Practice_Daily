package ex_04_TypeCasting;

public class Lab_02_TypeCasting {
    public static void main(String[] args) {
        int courseFee= 300;
        float gst= 15.5f;
        int result = courseFee+(int)gst;// Narrowing have data loss
        System.out.println(result);
        float result1 = courseFee+gst;  // Widening
        System.out.println(result1);


    }
}
