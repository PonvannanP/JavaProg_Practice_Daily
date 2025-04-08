package ex_12_Arrays;

public class Example5_Array_reverse {
    public static void main(String[] args) {
        int[]numbers={1,2,3,4,5};
        System.out.println(numbers.length);

        // There is no built in Property function for Array reverse

        for(int i=4;i>=0;i--)
        {
            System.out.println(numbers[i]);
        }
    }
}
