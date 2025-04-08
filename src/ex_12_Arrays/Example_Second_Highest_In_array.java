package ex_12_Arrays;

import java.util.Arrays;

public class Example_Second_Highest_In_array {
    public static void main(String[] args) {
        int[]numbers={10,45,23,87,34};
        Arrays.sort(numbers);// Sort the numbers
        System.out.println(numbers[numbers.length-2]);// After sorted length -2 will give
        // the second highest



    }
}
