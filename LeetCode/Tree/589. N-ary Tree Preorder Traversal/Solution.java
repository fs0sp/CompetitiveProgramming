/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    
    public List<Integer> helper(Node root, List<Integer> list) {
        if(root == null) {
            return list;
        }
        
        list.add(root.val);
        
        for(Node children : root.children) {
            helper(children, list);
        }
        
        return list;
        
    }
    
    public List<Integer> preorder(Node root) {
        
        List<Integer> list = new ArrayList<>();
        
        list = helper(root, list);
        
        return list;
        
    }
}