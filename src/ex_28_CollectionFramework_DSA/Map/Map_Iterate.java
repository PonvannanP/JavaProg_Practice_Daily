package ex_28_CollectionFramework_DSA.Map;

import java.util.HashMap;
import java.util.Map;

// Iterate over the map
public class Map_Iterate {
    public static void main(String[] args) {
        Map<String,Integer> map2=new HashMap();
        map2.put("id", 1);
        map2.put("id2", 2);
        map2.put("id3", 34);
        map2.put("id4", null);
        map2.put("id5", null);
        map2.put(null, 100);

     // Advance for loop to get each and every values
    for(Map.Entry<String,Integer> item: map2.entrySet())
    {
        System.out.println(item.getKey() +"->" +item.getValue());

    }

}
}
