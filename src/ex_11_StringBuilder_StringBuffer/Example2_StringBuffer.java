package ex_11_StringBuilder_StringBuffer;

public class Example2_StringBuffer {
    public static void main(String[] args) {
        StringBuffer stringBuffer=new StringBuffer("Raja");
        stringBuffer.append("Pon");
        System.out.println(stringBuffer);// The older string is deleted and only one
        // string is presented which is "RajaPon" because stringBuffer is mutuable in nature
        System.out.println(stringBuffer.reverse());// String will be reversed
    }
}
