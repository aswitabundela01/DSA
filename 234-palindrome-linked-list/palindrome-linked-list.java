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
//  first find mid element
// reverse LL from mid
// check head equal iff not false
class Solution {
    public boolean isPalindrome(ListNode head) {
    ListNode slow = head;
    ListNode fast= head;
    int size=0;
    ListNode mid=head;
    if(head==null ||head.next==null){
        return true;
    }
    ListNode temp=head;
    while(temp!=null){
        size++;
        temp=temp.next;
    }
    while(fast !=null&& fast.next !=null ){
        slow=slow.next;
        fast=fast.next.next;
    }
    if(size%2==0){
        mid=slow;
    }else{
        mid=slow.next;
    }
    ListNode prev =null;
    ListNode next;
    ListNode curr =mid;
    while(curr!=null){
      next=  curr.next;
      curr.next =prev;
        prev = curr;
        curr=next;
    }
    mid=prev;
    ListNode start=head;
    while(mid!=null){
        if(start.val!=mid.val){
            return false;
            // break;
        }
        start=start.next;
        mid=mid.next;
    }
    return true;
    }
}