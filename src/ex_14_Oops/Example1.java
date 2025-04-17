package ex_14_Oops;

public class Example1 {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="roll";
        System.out.println(s1.name);
        // Student- Class loading
        //s1- Object reference
        // new Student()- Object creation
    }

}

class Student
{
    String name;
    int rollno;

    void sleep()
    {

    }
}
