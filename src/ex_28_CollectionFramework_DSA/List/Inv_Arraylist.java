package ex_28_CollectionFramework_DSA.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Inv_Arraylist {
    public static void main(String[] args) {
        List marks = new ArrayList();
        marks.add(91);
        marks.add(95);
        marks.add(56);
        marks.add(89);

        System.out.println(marks);
        Collections.sort(marks);// Marks will be sorted
        System.out.println(marks);

        // Collection - Interface
        // Collections - Class (it contains complete methods which list,set, queue may required)

        Collections.sort(marks,Collections.reverseOrder());
        System.out.println(marks);// Sorted marks will print in a reverse order


    }
}
