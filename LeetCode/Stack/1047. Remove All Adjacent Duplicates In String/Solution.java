class Solution {
    public String removeDuplicates(String S) {
        
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        String result = "";
        
        for(int i=0;i<S.length();i++) {
            if(!stack.isEmpty() && stack.peek() == S.charAt(i)) {
                stack.pop();
                
            } else {
                stack.push(S.charAt(i));
            }           
        }
        
        while(!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        
        return sb.reverse().toString();
        
    }
}