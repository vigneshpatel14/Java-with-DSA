package Linked_List;

public class Basics {
    public static class  Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
        }
    }

    public static class linkedlist {
        Node head = null;
        Node tail = null;
        int size = 0;

        void insertatend(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
//                size++;
            } else {
                tail.next = temp;
            }
            tail = temp;
            size++;
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        void insertathead(int val) {
            Node temp = new Node(val);
            if (head == null) {
                insertatend(val);
            } else {
                temp.next = head;
                head = temp;
            }
            size++;
        }

        void insertAt(int idx, int val) {
            Node t = new Node(val);
            Node temp = head;
            if (idx == size) {
                insertatend(val);
                return;
            } else if (idx == 0) {
                insertathead(val);
                return;
            } else if (idx < 0 || idx > size) {
                System.out.println("Invalid Data");
                return;
            }
            for (int i = 1; i <= idx - 1; i++) //From 1st index because already temp assigned to 0th kadha
            {
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
            size++;
        }

        int getAt(int idx) {
            if (idx == 0 || idx > size) {
                return -1;
            }
            Node temp = head;
            for (int i = 1; i <= idx; i++) {
                temp = temp.next;
            }
            return temp.data;
        }

        void deleteAt(int idx) {
            if (idx == 0) {
                head = head.next;
                size--;
            }
            Node temp = head;
            for (int i = 1; i <= idx - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (idx == size - 1) {
                tail = temp;
            }
            size--;
        }
    }
        public static void main(String[] args) {
            linkedlist ll = new linkedlist();
            ll.insertatend(10);
            ll.insertathead(3);
            ll.insertathead(192);
            ll.insertAt(1,99);
            ll.display();
            System.out.println(ll.tail.data);
            System.out.println(ll.size);
            System.out.println(ll.getAt(3));
            ll.deleteAt(3);
            ll.display();
        }
    }
