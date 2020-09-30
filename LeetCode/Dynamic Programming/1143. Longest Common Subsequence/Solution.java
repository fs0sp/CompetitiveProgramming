class Solution {
    
    Integer memo[][];
    
    
    public int lcsMemo(String s1, String s2, int m, int n) {
        
        int res = 0;
        
        if(memo[m][n] != null) {
            return memo[m][n];
        }
        
        if(n==0 || m==0){
            res=0;
        }
        
        
        
        else if(s1.charAt(m-1) == s2.charAt(n-1)) {
            res = 1 + lcsMemo(s1, s2, m-1, n-1);
        } 
        
        else {
            res = Math.max(lcsMemo(s1, s2, m-1, n), lcsMemo(s1, s2, m, n-1));
        }
        memo[m][n]  = res;
        return memo[m][n];
        
    }
    
    
    public int longestCommonSubsequence(String text1, String text2) {
        memo = new Integer[text1.length() + 1][text2.length() + 1];
        
        return lcsMemo(text1, text2, text1.length(), text2.length());
    }
}