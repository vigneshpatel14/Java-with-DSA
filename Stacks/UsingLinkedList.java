package Stacks;

public class UsingLinkedList {
    public static class Node
    {
        int val;
        Node next;
        Node(int x)
        {
            this.val = x;
        }
    }

    public static class LLStack
    {
        private Node head = null;
        private int size = 0;
        void push(int x)
        {
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }

        void displayrev()
        {
            Node temp = head;
            while(temp != null)
            {
                System.out.print(temp.val+" ");
                temp = temp.next;
            }
            System.out.println();
        }

        int size()
        {
            return size;
        }

        int pop()
        {
            if(head == null)
            {
                System.out.println("Stack is Empty");
                return -1;
            }

            int x = head.val;
            head = head.next;
            return x;
        }

        int peek()
        {
            if(head == null)
            {
                System.out.println("Empty Stack");
                return -1;
            }
            return head.val;
        }

        void display()
        {
            displayrecursion(head);
            System.out.println();
        }



        void displayrecursion(Node h)
        {
            if(h == null) {
                return;
            }
            displayrecursion(h.next);
            System.out.print(h.val+" ");
        }
    }

    public static void main(String[] args) {
        LLStack st = new LLStack();
        st.push(4);
        st.display();
        st.pop();
        st.peek();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.display();
        st.displayrev();
    }
}