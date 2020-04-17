class Solution {
    public boolean backspaceCompare(String S, String T) {
    
        return helper(S).equals(helper(T));
                
    }
    
    public String helper(String s) {
        Stack<Character> stack = new Stack<>();
        
        for(char c : s.toCharArray()) {
            if(c != '#') {
                stack.push(c);
            } else if (!stack.empty()) {
                stack.pop();
            }
            
        }
        
        return String.valueOf(stack);
        
    } 
}