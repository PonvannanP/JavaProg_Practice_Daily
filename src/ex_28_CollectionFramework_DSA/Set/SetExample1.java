package ex_28_CollectionFramework_DSA.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample1 {
    public static void main(String[] args) {
        Set hs=new HashSet();
        Set lhs=new LinkedHashSet();
        Set ts=new TreeSet();

        hs.add("Java");
        hs.add("Java");// duplicates are not allowed
        hs.add("Java1");
        System.out.println(hs);
    }
}
