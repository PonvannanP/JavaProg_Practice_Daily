package ex_08_For_Loop;

public class For_Loop_Odd_Even_Top_50 {
    public static void main(String[] args) {
        // To find the even numbers from 1 to 50
        // even number-> i%2==0-> it is a even number
        for(int i=0;i<=50;i++)
        {
            if(i%2==0)
                System.out.println("Even number is " +i);//Even numbers
            // if you have only one line in if statement then we don't have to include
            //curly braces if you have multiple lines then we have to include curly braces

            //else
                {
                    //System.out.println("Odd number is "+i);//Odd numbers
                }//
        }

    }
}
