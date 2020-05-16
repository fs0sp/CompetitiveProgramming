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
    
    
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<inorder.length; i++){
            map.put(inorder[i], i);
        }
        
        return helper(postorder, new int[]{postorder.length - 1}, 0, inorder.length-1, map );
    }
    
    public TreeNode helper(int[] po, int[] poPointer, int startIn, int endIn, Map<Integer,Integer> map){
        
        if(startIn > endIn) {
            return null;
        }
        
        int tempRoot = po[poPointer[0]--];
        TreeNode root = new TreeNode(tempRoot);
        
        if(startIn == endIn) {
            return root;
        }
        
        int k = map.get(tempRoot);
        
        root.right = helper(po, poPointer, k + 1, endIn, map);
        root.left = helper(po, poPointer, startIn, k - 1, map);
        
        
        return root;
        
    }
}