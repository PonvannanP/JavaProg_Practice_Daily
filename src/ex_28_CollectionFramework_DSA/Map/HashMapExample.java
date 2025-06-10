package ex_28_CollectionFramework_DSA.Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map map=new HashMap();
        map.put("id",1);
        map.put("id",2);// Both the keys are same so updated value is used
        map.put("id2",2);
        map.put("id3",34);
        map.put("id6",34);// Duplicate values are allowed
        map.put("id4",null);
        map.put("id5",null);// Duplicate null values are allowed
        map.put(null,102);
        map.put(null,103);// Only one null key is allowed and latest one is used
        System.out.println(map);

        System.out.println(map.size());
        System.out.println(map.isEmpty());// false
        System.out.println(map.containsKey("id2"));// true
        System.out.println(map.containsValue(99));// false

        System.out.println(map.keySet());// Getting all the key values
        System.out.println(map.values());// Getting all the values

        System.out.println(map.get("id3"));
    }
}
