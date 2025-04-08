package ex_12_Arrays;

public class Example3_Arrays_Creation {
    public static void main(String[] args) {
        String[]names={"raja","pon","dev"};
        System.out.println(names[1]);
        System.out.println(names[0]);
        System.out.println(names[2]);

        //Another way of creating arrays
        String[]namm=new String[3];
        namm[0]="kan";
        namm[1]="nak";
        namm[2]="ank";
        System.out.println(namm.length);
        System.out.println(namm[2]);

        boolean[]is_male_data=new boolean[2];
        is_male_data[0]=true;
        is_male_data[1]=false;
        System.out.println(is_male_data.length);
        System.out.println(is_male_data[1]);

    }
}
