/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
 
        
        ListNode tempNode = new ListNode(0);
        tempNode.next = head;
        ListNode newNode = tempNode;
        
        while(newNode.next != null){
            if(newNode.next.val == val) {
                newNode.next = newNode.next.next;
                
            } else {
                newNode = newNode.next;
            }
        }
        
        return tempNode.next;
    }       
}