/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution{
    public ListNode reverseKGroup(ListNode head, int k) {
    ListNode curr = head;
    int count = 0;

    // check if k nodes exist
    while (curr != null && count < k) {
        curr = curr.next;
        count++;
    }

    if (count < k) return head; // not enough nodes

    // reverse k nodes
    curr = head;
    ListNode prev = null, next = null;

    for (int i = 0; i < k; i++) {
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }

    // recursion for remaining list
    head.next = reverseKGroup(curr, k);

    return prev; // new head of this group
}

}