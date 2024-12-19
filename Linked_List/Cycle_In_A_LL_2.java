package Linked_List;

public class Cycle_In_A_LL_2 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public class Solution {
        public boolean hasCycle(ListNode head) {
            ListNode slow = head , fast = head;
            if(head == null || head.next == null ||head.next.next == null)
                return false;
            while(fast != null)
            {
                if(slow == null)
                {
                    return false;
                }
                slow = slow.next;
                if(fast.next == null)
                {
                    return false;
                }
                fast = fast.next.next;
                if(slow == fast)
                {
                    return true;
                }
            }
            return false;
        }
    }
}
