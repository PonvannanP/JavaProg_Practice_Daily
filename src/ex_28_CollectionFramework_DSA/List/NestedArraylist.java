package ex_28_CollectionFramework_DSA.List;

import java.util.ArrayList;
import java.util.List;

public class NestedArraylist {
    public static void main(String[] args) {
        List<String> fruits1 = new ArrayList();// only String is allowed
        fruits1.add("orange");
        fruits1.add("apple");
        fruits1.add("cherry");
        System.out.println(fruits1);

        List fruits2 = new ArrayList();
        fruits2.add("mango");
        fruits2.add("grapes");
        fruits2.add("papaya");
        System.out.println(fruits2);

        List vegatables = new ArrayList();
        vegatables.add("tamato");
        vegatables.add("patato");
        vegatables.add("onion");
        System.out.println(vegatables);

        List allfruits=new ArrayList();
        allfruits.add(fruits1);
        allfruits.add(fruits2);
        allfruits.add(vegatables);
        System.out.println(allfruits);// adding all list in one list
        System.out.println(allfruits.get(2));// second index with list will get printed
    }
}
