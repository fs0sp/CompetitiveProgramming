

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    
    
    public ListNode rev(ListNode root) {

        
        if(root == null) {
            return null;
        } else {
            if(root.next == null) {
                return root;
            }
        }
    
        
        ListNode nextNode = root.next;
        root.next = null;
        
        ListNode restNode = rev(nextNode);
        nextNode.next = root;
        
        return restNode;
        
    }
    
    
    public boolean isPalindrome(ListNode head) {
        
        ListNode slow = head;
        ListNode fast = head;
        
        
        while(fast!= null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }        
        
        slow = rev(slow);
        fast = head;
        
        while(slow != null) {
            if(slow.val != fast.val) {
                return false;
            }
            slow = slow.next;
            fast = fast.next;
        }
        return true;
        
        
    }
}