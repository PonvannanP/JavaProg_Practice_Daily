package ex_05_TC;

public class TC_Example {
    public static void main(String[] args) {
        //int coursefee=200;
        //float gst=15.5F;
        //int total=coursefee+gst;// this is invalid incase of Narrowing Implicit concept is not allowed
        //int total=coursefee+(int)gst;// we should use Explicit concept incase of Narrowing also there
        // will ba data loss happen here when we use Explicit concept .5 value is data loss here
        //System.out.println(total);

        //To resolve this we should use bigger one

        int coursefee=200;
        float gst=15.5F;
        float total1=coursefee+gst;// this is widening because of implicit automatically it will
        //prints 215.5
        float total2=(float)coursefee+gst;// this is Explicit it can also be done but there will be data
        // loss here and same output will be printed which is 215.5
        System.out.println(total1);
        System.out.println(total2);

    }
}
