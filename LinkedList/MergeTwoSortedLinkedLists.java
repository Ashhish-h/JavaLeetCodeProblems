package LinkedList;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p1 = list1, p2 = list2, current = dummyHead;

        while(p1 != null && p2 != null){
            if(p1.val < p2.val){
                current.next = new ListNode(p1.val);
                current = current.next;
                p1 = p1.next;
            } else if(p1.val > p2.val){
                current.next = new ListNode(p2.val);
                current = current.next;
                p2 = p2.next;
            }else {
                current.next = new ListNode(p1.val);
                current = current.next;
                p1 = p1.next;
            }
        }
        while(p2 != null){
            current.next = new ListNode(p2.val);
            current = current.next;
            p2 = p2.next;
        }

        while(p1 != null){
            current.next = new ListNode(p1.val);
            current = current.next;
            p1 = p1.next;
        }
        return dummyHead.next;
    }
}