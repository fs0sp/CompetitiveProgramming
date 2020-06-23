/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    private int sum = 0;
    public void helper(TreeNode root, int L, int R) {
        
        if(root == null) return;
        
        if(root.val > L) {
            helper(root.left, L, R);
        }
        
        if(root.val >= L && root.val <= R) {
            sum += root.val;
        }
        
        if(root.val < R) {
            helper(root.right, L, R);
        }
    }
    
    public int rangeSumBST(TreeNode root, int L, int R) {
        
        sum = 0;
        
        helper(root, L, R);
        
        
        return sum;
    }
}