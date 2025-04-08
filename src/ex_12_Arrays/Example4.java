package ex_12_Arrays;

public class Example4 {
    public static void main(String[] args) {
        int[]marks=new int[4];
        marks[0]=25;
        marks[1]=65;
        marks[2]=90;
        marks[3]=50;

        for(int i=0;i<marks.length;i++)// Incase of arrays for loop it always go from 0 to length-1
        {
            System.out.println(marks[i]);// Printing is always done by indexation
        }


    }
}
