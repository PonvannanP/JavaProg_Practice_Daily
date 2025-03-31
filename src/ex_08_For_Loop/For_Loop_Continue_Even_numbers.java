package ex_08_For_Loop;

public class For_Loop_Continue_Even_numbers {
    public static void main(String[] args) {
        for(int i=0;i<=10;i++)
        {
            if(i%2!=0)
            {
                continue;
                //If it is not an Even number the code move back to top
                // when we are using continue after this the next line of code will not execute
            }
            System.out.println("even number");
        }
    }
}
