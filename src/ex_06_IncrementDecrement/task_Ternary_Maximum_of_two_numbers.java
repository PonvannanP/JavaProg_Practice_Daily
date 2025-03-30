package ex_06_IncrementDecrement;

public class task_Ternary_Maximum_of_two_numbers {
    public static void main(String[] args) {
        int number1=Integer.parseInt(args[0]);
        int number2=Integer.parseInt(args[1]);
        String result=number1>number2?"number1":"number2";
        System.out.println(result);

    }
}
