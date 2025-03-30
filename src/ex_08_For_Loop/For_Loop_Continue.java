package ex_08_For_Loop;

public class For_Loop_Continue {
    public static void main(String[] args) {
        for (int i = 0; i <= 50; i++) {
            if (i == 5) {
                continue;// when i=5, skip the below code and move to top
                // so only 5 will not execute in Output
            }
                System.out.println(i);
            }
        }
    }
