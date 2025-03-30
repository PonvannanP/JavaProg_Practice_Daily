package ex_06_IncrementDecrement;

public class If_CLI {
    public static void main(String[] args) {
        int age=Integer.parseInt(args[0]);
        if(age>19)
        System.out.println("You are allowed to vote");
        else
        {
            System.out.println("You are not allowed to vote");
        }
    }
}
