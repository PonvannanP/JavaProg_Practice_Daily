package ex_19_AccessModifiers.Police;

public class JCop {
    public static void main(String[] args) {
        Cop jrcop=new Cop(5); //He is also using Cop instance
        jrcop.canIshoot();// It is not allowed because private in Nature
    }
}
