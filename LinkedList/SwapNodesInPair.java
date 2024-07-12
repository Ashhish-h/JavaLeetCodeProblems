package LinkedList;


class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode current = dummyHead;
        
        while (current.next != null && current.next.next != null){
            ListNode p1 = current.next;
            ListNode p2 = current.next.next;

            p1.next = p2.next;
            current.next = p2;
            p2.next = p1;

            current = p1;
        }
        return dummyHead.next;
    }
}