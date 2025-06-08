package ex_28_CollectionFramework_DSA.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExample {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Vijay", 23);
        Student s2 = new Student(104, "Jai", 21);
        Student s3 = new Student(106, "Ajay", 27);

        //Putting the Students in list

        List<Student> Studentlist = new ArrayList();
        Studentlist.add(s1);
        Studentlist.add(s2);
        Studentlist.add(s3);

        Collections.sort(Studentlist);// You cannot sort the Studentlist because we have
        // not given anything to compare like(rollno,name,age)
        System.out.println(Studentlist);

        //        List marks = new ArrayList();
//        marks.add(91);
//        marks.add(95);
//        marks.add(93);
//        marks.add(87);
//        marks.add(41);

//        Collections.sort(marks);// Marks will be sorted

    }
}

    class Student implements Comparable<Student> // Implementing the Comparable method with student
    {
        private int rollno;
        private String name;
        private int age;

        // Parameter Constructor


        public Student(int rollno, String name, int age) {
            this.rollno = rollno;
            this.name = name;
            this.age = age;
        }


        //Printing the Student details

        @Override
        public String toString() {
            return "Student{" +
                    "rollno=" + rollno +
                    ", name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }


        //@Override
        //public int compareTo(Student o) {
            //return this.rollno-o.rollno;// o is the Object this will be automatically sorted
            // based on rollno

            //@Override
            //public int compareTo(Student o) {
                //return this.age-o.age;// o is the Object this will be automatically sorted
                // based on age

                @Override
                public int compareTo(Student o) {
                    return this.name.compareTo(o.name);// o is the Object this will be automatically sorted
                    // based on name

                    // By uing we can use only one mechanism(either we can compare by age or name or rollno)


        }
    }

