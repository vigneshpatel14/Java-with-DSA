package Queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class InterchangeFirsthalfAndSecondhalf {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);

        System.out.println(q); //1, 2, 3, 4, 5, 6, 7, 8

        Stack<Integer> st = new Stack<>();
        int x = (q.size()/2);
        for( int i = 1; i<= x  ; i++)
        {
            st.push(q.remove());
        } // 5 6 7 8               stack -> 4 3 2 1
        System.out.println(st);

        while(st.size() > 0)
        {
            q.add(st.pop());
        }  // 5 6 7 8 4 3 2 1
        System.out.println(q);

        x = (q.size()/2);
        for( int i = 1; i<= x ; i++)
        {
            st.push(q.remove());
        } // 4 3 2 1               stack -> 8 7 6 5
        System.out.println(q);

        x = (q.size()/2);
        while(st.size() > 0)
        {
            //While kuda use cheyachu untill stack empty
            //Remove one by one . pehle stack nundi then queue
            q.add(st.pop());
            q.add(q.remove());
        }
        System.out.println(q);


        //Now reverse the queue

        while(q.size() > 0)
        {
            st.push(q.remove());
        }

        while (st.size() > 0)
        {
            q.add(st.pop());
        }

        System.out.println(q);
    }
}
