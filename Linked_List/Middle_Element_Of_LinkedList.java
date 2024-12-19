package Linked_List;

public class Middle_Element_Of_LinkedList {

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }


    public ListNode middlenode(ListNode head)
    {
    ListNode slow = head;
    ListNode fast = head;
        while(fast !=null)

    {
        fast = fast.next;
        if (fast == null) {
            return slow;
        }
        slow = slow.next;
        fast = fast.next;
    }
        return slow;
}






//      //Definition for singly-linked list.
//
//
//    class Solution {
//        public ListNode middleNode(ListNode head) {
//            ListNode temp = head;
//            int count = 0;
//            while(temp != null)
//            {
//                temp = temp.next;
//                count++;
//            }
//            int m = count%2==0?count/2+1:(count+1)/2;
//            temp = head;
//            for(int i = 1;i<m;i++)
//            {
//                temp = temp.next;
//            }
//            return temp;
//        }
//    }
}
