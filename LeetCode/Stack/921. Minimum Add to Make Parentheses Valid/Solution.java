class Solution {
    public int minAddToMakeValid(String S) {
        int close = 0;
        int open = 0;
        
        for(int i=0;i<S.length();i++) {
            char c = S.charAt(i);
            
            if(c == '(') {
                close++;
            } else {
                if(close == 0) {
                    open++;
                } else {
                    close--;
                }
            }
            
            
        }
        
        return close + open;
        
    }
}