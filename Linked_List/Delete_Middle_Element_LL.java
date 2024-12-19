package Linked_List;

public class Delete_Middle_Element_LL {
    public class ListNode
    {
       int val;
       ListNode next;
       ListNode() {}
       ListNode(int val) { this.val = val; }
       ListNode(int val, ListNode next)
       {
           this.val = val; this.next = next;
       }
    }

    class Solution {
        public ListNode deleteMiddle(ListNode head) {
            if (head == null || head.next == null) {
                return null;
            }
            ListNode curr=head.next.next;
            ListNode prev= head;
            while(curr!=null && curr.next!=null){
                curr=curr.next.next;
                prev=prev.next;
            }
            prev.next= prev.next.next;

            return head;
        }
    }

}
