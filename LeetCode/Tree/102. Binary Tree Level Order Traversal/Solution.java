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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> result = new  ArrayList<List<Integer>>();
        Queue<TreeNode> queue = new LinkedList();
        
        if(root == null) {
            return result;
        }
        
        queue.add(root);
        
        
        
        while(!queue.isEmpty()) {
            
            int size = queue.size();
            ArrayList<Integer> list = new ArrayList<>();
            
            for(int i=0;i<size;i++) {
                TreeNode temp = null;
            
                temp = queue.poll();

                list.add(temp.val);

                if(temp.left != null) {
                    queue.add(temp.left);
                }
                if(temp.right != null) {
                    queue.add(temp.right);
                }             
            }
            
            result.add(list);               
        }
        
        return result;       
        
        
    }
}