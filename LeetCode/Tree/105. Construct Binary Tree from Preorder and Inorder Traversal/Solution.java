/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    
    public TreeNode helper(int[] p, int[] prePointer, int startIn, int endIn, Map<Integer,Integer> map) {
        
        if(startIn > endIn) {
            return null;
        }
        
        int tempRoot = p[prePointer[0]++];
        TreeNode root = new TreeNode(tempRoot);
        
        
        // for leaf node 
        if(startIn == endIn) {
            return root;
        }
        
        int k = map.get(tempRoot);
        
        root.left = helper(p, prePointer, startIn, (k - 1), map);
        root.right = helper(p, prePointer,(k + 1), endIn, map);
        
        return root;
        
    }
    
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<inorder.length;i++) {
            map.put(inorder[i],i);
        }
        
        return helper(preorder, new int[]{0}, 0, inorder.length-1, map);
    }
}