package ex_16_Inheritance;

public class MultilevelInheritance {
    public static void main(String[] args) {
GrandFather_Multilevel g1=new GrandFather_Multilevel();
g1.gf();// Grandfather can access only its behaviour

        Father_Multilevel f1=new Father_Multilevel();
        f1.gf();
        f1.f();// father can access Grandfather and its behaviour

        Son_Multilevel s1=new Son_Multilevel();
        s1.gf();
        s1.f();
        s1.s();// Son can access Grandfather,father and its behaviour


    }

}

