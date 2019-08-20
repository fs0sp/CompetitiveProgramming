/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null) {
            return null;
            
        }
        
        else if(head.next == null) {
            return head;
        }
        
        ListNode nextNode = head.next;
        head.next = null;
        
        ListNode restNode = reverseList(nextNode);
        nextNode.next = head;
        
        return restNode;
        
    }
}