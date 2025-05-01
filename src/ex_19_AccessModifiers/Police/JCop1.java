package ex_19_AccessModifiers.Police;

public class JCop1 {
    public static void main(String[] args) {
        Cop jr1=new Cop(10);
        jr1.canIshoot();// He can also access it because both are in same package
    }
}
