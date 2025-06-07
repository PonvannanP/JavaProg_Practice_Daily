package ex_28_CollectionFramework_DSA.List;


public class Student {


    private String name;
    private String rollNo;

    public Student(String name, String rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public void printDetails(){
        System.out.println("Student Name : " + this.name);
        System.out.println("Student Roll No: " + this.rollNo);
    }

    @Override
    public String toString() { // By using this toString method list of object references can be stored in Arraylist
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo='" + rollNo + '\'' +
                '}';
    }
}






