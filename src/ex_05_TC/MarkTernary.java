package ex_05_TC;

public class MarkTernary {
    public static void main(String[] args) {
        String result=args[3];
        int res=Integer.parseInt(result);
        String mark=(res>=90)? "GradeA":(res>=80)?"GradeB":(res>=70)?"GradeC":(res>=60)?"GradeD":"Fail";
        System.out.println(mark);
    }
}
