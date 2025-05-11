package ex_24_Enum;

public class Enum_Example1 {
    public static void main(String[] args) {
        System.out.println(Day.FRIDAY);// no need to create directly by using dot operator
        // we can call
        System.out.println(Project_urls.Google);// Google will be printed
    }

}

class A
{
   // String[]days={"Mon","Tue","Wed","Thur","Fri","Sat","Sun"}; // days will never change

}

enum Day
{
    SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;
        }

 enum Project_urls
 {
     Google,Katalon, RestAssured;
 }


