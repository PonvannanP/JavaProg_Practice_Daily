package ex_10_String;

import java.util.Locale;

public class String_Functions {
    public static void main(String[] args) {
        char C='A';
        System.out.println(C);

        String s1="A";
        System.out.println(s1.length());// Total length of the string
        System.out.println(s1.toLowerCase());// each character becomes lowercase now
        System.out.println(s1.toUpperCase());// still Uppercase will be executed because
        // the String is already in Uppercase
        System.out.println(s1.concat("E"));// add the value E with A
    }
}
