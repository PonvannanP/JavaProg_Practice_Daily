package ex_28_CollectionFramework_DSA.Compartor;

import java.util.*;

public class ComparatorExample {
    public static void main(String[] args) {
        Student1 s1  = new Student1(107,"Vijay",23);
        Student1 s2  = new Student1(104,"Jai",21);
        Student1 s3  = new Student1(106,"Ajay",27);

        //Putting the Students in list

        List<Student1> studentList = new ArrayList();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);

        //Collections.sort(studentList,new AgeComparator());// You cannot sort the Studentlist because we have
        // not given anything to compare like(rollno,name,age)

        //Collections.sort(studentList, new RollnoComparator());

        Collections.sort(studentList, new NameComparator());

        System.out.println(studentList);



    }
}

//class AgeComparator implements Comparator<Student1>
//{

    //@Override
    //public int compare(Student1 o1, Student1 o2) {
        //return o1.getAge()- o2.getAge();// this will be sorted based on the age
    //}
//}

//class RollnoComparator implements Comparator<Student1>
//{

    //@Override
    //public int compare(Student1 o1, Student1 o2) {
        //return o1.getRollNo()-o2.getRollNo(); // this will be sorted based on the rollno
    //}
//}

class NameComparator implements Comparator<Student1>
{

    @Override
    public int compare(Student1 o1, Student1 o2) {
        return o1.getName().compareTo(o2.getName()); // this will be sorted based on the name
    }
}


class Student1 {
    private int rollNo;
    private String name;
    private int age;

    // Constructor, getters, setters, toString

// Tp print the Student details
    @Override
    public String toString() {
        return "Student1{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    // Paramter Constructor
    public Student1(int rollNo, String name, int age) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }

    // Encapsulation
    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}