package ex_12_Arrays;

public class Example1 {
    public static void main(String[] args) {
        int a=10;
        int[]marks={91,90,89,85,86};
        System.out.println(marks.length);
        System.out.println(marks[2]);
        System.out.println(marks[-1]);// ArrayIndexOutofboundException
        System.out.println(marks[10]);// ArrayIndexOutofboundException

    }


}
