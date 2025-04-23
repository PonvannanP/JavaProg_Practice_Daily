package ex_12_Arrays;

public class Task_Second_Highest_Array {
    public static void main(String[] args) {
        int[]numbers={10,45,23,87,34};
        System.out.println(numbers.length);

        int max1= numbers[0];
        int number1 = numbers[0];

        for(int i=0;i<numbers.length;i++)
        {
            if(numbers[i]>max1)
            {
                max1=numbers[i];
                number1= numbers[i];

                System.out.println(number1);
            }
        }

    }

}
