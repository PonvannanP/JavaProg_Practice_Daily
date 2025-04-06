package ex_11_StringBuilder_StringBuffer;

import java.sql.SQLOutput;

public class Example4 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Java");
        sb.append(" Programming");
        System.out.println(sb);//Java Programming is the Output because before Programming
        // space is there
        sb.delete(5,16);
        System.out.println(sb);// Programming string will be deleted
        sb.replace(0,4,"C++");// 0 to 4 string value is "Java"
        // Java will be replaced with C++
        System.out.println(sb);


    }
}
