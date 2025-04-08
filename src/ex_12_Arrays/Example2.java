package ex_12_Arrays;

public class Example2 {
    public static void main(String[] args) {
        int[]age={12,21,13,31,42};

        // second way to create a array
        int[] age2=new int[3];// Before creating an array you need to give fixed size
        age2[0]=12;
        age2[1]=21;
        age2[2]=13;

        // Third way to create a array
        int age3[]=new int[3];// Before creating an array you need to give fixed size

        String[]names=new String[2];// String array
        names[0]="Raja";
        names[1]="Yuvi";

        System.out.println(age);// it will print the address we can print them by using index
        // value
        System.out.println(age[1]);//we can print them by using index value


    }
}
