package ex_19_AccessModifiers.Criminal;

import ex_19_AccessModifiers.Police.Cop;

public class Thief {
    public static void main(String[] args) {
        //Cop theif=new Cop(100);// Thief is using Cop instance
        //theif.canIshoot();
        //System.out.println(theif.gun);// Theif can shoot because it is public in Nature
        // and this is not allowed

        // Now Thief is not allowed because the method is private
    }
}
