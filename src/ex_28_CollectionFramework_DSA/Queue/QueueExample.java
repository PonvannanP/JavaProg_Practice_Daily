package ex_28_CollectionFramework_DSA.Queue;

import java.util.PriorityQueue;

public class QueueExample {

    public static void main(String[] args) {
        // Queue -> 0.001% in Automation
        PriorityQueue q = new PriorityQueue();
        q.add("Pramod");
        q.add("Dutta");
        // PQ -> Natural Sorting is done automatically
        System.out.println(q);
        System.out.println(q.peek());// First element is seen
        System.out.println(q);
        System.out.println(q.poll());// remove the first element
        System.out.println(q);


    }
}

