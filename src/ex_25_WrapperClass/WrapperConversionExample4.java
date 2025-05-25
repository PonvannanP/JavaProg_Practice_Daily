package ex_25_WrapperClass;

public class WrapperConversionExample4 {
    public static void main(String[] args) {
        String num="10";
        int aa=10;

        // String -> Wrapper -> parseX()  ,   Integer.parseInt(num);Double.parseDouble()
        Integer a=Integer.parseInt(num);

        // String to Primitive
        int bb=Integer.parseInt(num);
        // int aa-> Primitive, Integer.parseInt(num)-> Wrapper

        // String to Wrapper
        Integer b=Integer.valueOf(num);

        // Wrapper to String(toString method)
        System.out.println(a.toString());

        // Primitive to String
        int age=10;
        Integer age_wrapper=age;// Primitive
        System.out.println(age_wrapper.toString());//


    }
}
