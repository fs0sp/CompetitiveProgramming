class Solution {
    public int numJewelsInStones(String J, String S) {
        
        int count = 0;
        
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<J.length();i++) {
            set.add(J.charAt(i));
        }
        
        for(int i=0;i<S.length();i++) {
            char ch = S.charAt(i);
            
            if(set.contains(ch)) {
                count += 1;
            } 
            
        }
        
        return count;
        
    }
}