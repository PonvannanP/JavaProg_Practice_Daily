package ex_11_StringBuilder_StringBuffer;

public class Example3_StringBuilder {
    public static void main(String[] args) {
        StringBuilder stringBuilder=new StringBuilder("Rahh");
        stringBuilder.append("Rajh");// append function can allow different data types
        System.out.println(stringBuilder);//The older string is deleted and only one
        // string is presented which is "RahhRajh" because stringBuilder is mutuable in nature
    }
}
