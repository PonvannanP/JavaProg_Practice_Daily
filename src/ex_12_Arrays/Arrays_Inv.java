package ex_12_Arrays;

public class Arrays_Inv {
    //find the maximum and minimum number in the array
    public static void main(String[] args) {
        int[] array = {34, 20, 13, 57, 55};
        int max_output = give_me_max(array);// it is a function gives maximum value in the
        // program
    }


    private static int give_me_max(int[] array) {
        int max=array[0];
        for(int i=0; i<array.length;i++)
        {
            if(array[i]>max)// array[i] is greater than max then it will not go into the loop
            {
                max=array[i];
                System.out.println(max);


            }
        }
        return max;// Atlast it will return the maximum element


    }
}