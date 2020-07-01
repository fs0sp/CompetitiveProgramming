class Solution {
    public boolean isAnagram(String s, String t) {
        
        // HASH TABLE METHOD
        // TIME Complexity : O(n)
        // Space Complexity : O(1) : because the count array remains constant.
        
        if(s.length() != t.length()) {
            return false;
        }
        
        int[] count = new int[26];
        
        for(int i=0;i<s.length();i++) {
            count[s.charAt(i) - 'a'] += 1;
        }
        
        for(int i=0;i<t.length();i++) {
            count[t.charAt(i) - 'a'] -= 1;
        }
        
        for(int i=0;i<26;i++) {
            if(count[i] != 0) {
                return false;
            }
        }
        
        return true;
    }
}