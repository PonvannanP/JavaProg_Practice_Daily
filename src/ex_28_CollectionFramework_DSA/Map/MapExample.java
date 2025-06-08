package ex_28_CollectionFramework_DSA.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {
    public static void main(String[] args) {
        Map m1=new HashMap();
        // Map is a key and value pair
        // name -> pramod
        m1.put("name","pramod");
        m1.put("rollno","1");
        m1.put("phone","9999345");
        System.out.println(m1);
        // Incase of Hashmap no order is maintained

        Map m2=new LinkedHashMap();
        m2.put("name","pramod");
        m2.put("rollno","1");
        m2.put("phone","9999345");
        System.out.println(m2);
        // Incase of LinkedHashmap order is maintained

        Map m3=new TreeMap();
        m3.put("firstname","pramod");
        m3.put("lastname","dutta");
        m3.put("rollno","1");
        m3.put("phone","9999345");
        System.out.println(m3);
        // natural sorting is based on keys




    }



}
