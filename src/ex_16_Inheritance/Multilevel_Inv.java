package ex_16_Inheritance;

public class Multilevel_Inv {
    public static void main(String[] args) {

        // Dynamic Dispatch

        //Son_Multilevel s1=new GrandFather_Multilevel();// When son is present Grandfather
        // is getting borned this is not possible

        //Son_Multilevel s2=new Father_Multilevel(); //when son is present father
        // is getting borned this is not possible

        Son_Multilevel s3 = new Son_Multilevel();// /when son is present son
        // is getting borned this is possible

        GrandFather_Multilevel g1 = new Son_Multilevel(); // When Grandfather is present son
        // is getting borned this is possible

        g1.gf();
        g1.home();// home function is available in all three classes so when we are calling
        // home function is called it will call the son class because son object is created



        GrandFather_Multilevel g2 = new Father_Multilevel(); // When Grandfather is present Father
        // is getting borned this is possible
        g2.home();//home function is available in all three classes so when we are calling
        // the home function is called it will call the Father class because father object is created




        Father_Multilevel f1 = new Son_Multilevel(); // When father is present Son
        // is getting borned this is possible
        f1.f();
        f1.home();// home function is available in all three classes so when we are calling
        // home function is called it will call the son class because son object is created

        //Father_Multilevel f2=new GrandFather_Multilevel(); // When father is present GrandFather
        // is getting borned this is not possible
    }
}









