package LinkedList;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */

public class DeleteANodeInLinkedList {
    class Solution {
        public void deleteNode(ListNode node) {
            node.val = node.next.val; // copying the value of next node to the node to be deleted
            node.next = node.next.next; // skiping the next node;
        }
    }
}
