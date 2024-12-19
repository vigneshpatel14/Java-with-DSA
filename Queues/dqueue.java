package Queues;

import  java.util.*;

public class dqueue {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();

//        dq.addLast(1);
//        dq.addLast(2);
//        dq.addLast(3);
//        dq.addLast(4);
//
//        System.out.println(dq);
//
//        dq.addFirst(5);
//        System.out.println(dq);
//        dq.removeLast();
//        System.out.println(dq);
//        dq.removeFirst();
//        System.out.println(dq);
//        System.out.println(dq.getFirst());
//        System.out.println(dq.getLast());


        dq.addLast(1);
        dq.addLast(2);
        dq.addLast(3);
        dq.addLast(4);
        dq.add(5); //It defaults add from last
        System.out.println(dq);

//        System.out.println(dq.getClass());

        dq.remove(); //It removes from first . so behaves like a normal queue

//       dq.removeAll(dq); //Removes everything

        dq.add(3);
        System.out.println(dq);

        dq.removeLastOccurrence(3); //Removes last occured of that Element
        System.out.println(dq);
    }
}
