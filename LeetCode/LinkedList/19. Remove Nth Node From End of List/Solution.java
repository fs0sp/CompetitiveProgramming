/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    
    
    
    public ListNode removeNthFromEnd(ListNode head, int n) {
      
        
        if(head == null) return null;
        
        if(head.next == null) return null;
        ListNode temp = new ListNode(0);
        ListNode  slow = temp;
        ListNode  fast = temp;
        slow.next = head;
        
        for(int i=1;i<=n+1;i++) {
            fast = fast.next;
        }
        
        
        while(fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        
        
        return temp.next;
        
    }
}