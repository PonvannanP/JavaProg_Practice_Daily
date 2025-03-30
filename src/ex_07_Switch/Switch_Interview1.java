package ex_07_Switch;

public class Switch_Interview1 {
    public static void main(String[] args) {
        char ch = 'A';
        switch(ch) {// 100% valid because Char ch is also an Integer
            case 65:
            {
                System.out.println("ASCII");// ASCII value for 'A' is 65 so it
                //matches with case 65
                break;
            }
            default:
            {
                System.out.println("Not ASCII");
            }

        }
    }
}
