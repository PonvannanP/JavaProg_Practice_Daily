package ex_03_Java_Operators;

public class AND_OR_GATE {
    public static void main(String[] args) {
        boolean a=true&&true;
        boolean b=true&&false;
        boolean c=false&&true;
        boolean d=false&&false;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        boolean f=true||true;
        boolean g=true||false;
        boolean h=false||true;
        boolean i=false||false;
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);
    }
}
