package LinkedList;

import java.util.HashMap;

public class LinkedListCycleII {
    public ListNode detectCycle(ListNode head) {
        HashMap<ListNode, Boolean> map = new HashMap<>();
        ListNode curr = head;
        while (curr != null) {
            if (map.containsKey(curr)) {
                return curr;
            }
            map.put(curr, true);
            curr = curr.next;
        }
        return null;
    }
}
