package ex_03_Java_Operators;

public class RelationalOperators {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println(b<a);// b is greater than so it prints false

        int c=20;
        int d=30;
        System.out.println(d>c);// d is greater than c so it prints True

        int e=20;
        int f=30;
        System.out.println(f<=e);// f is greater than e so it prints false

        int g=20;
        int k=25;
        System.out.println(k>=g);// k is greater than g so it prints true

        int feb=35;
        int mar=25;
        System.out.println(feb==mar);// feb is not equal to mar so it prints false

        int apr=25;
        int may=25;
        System.out.println(may!=apr);// it will print false because we are using not equal to
    }
}
