class Solution {
    public void reverseString(char[] s) {
        int first = 0;
        int last = s.length-1;
        
        while(first < last) {
            char temp = s[last];
            s[last] = s[first];
            s[first] = temp;
            
            first += 1;
            last -= 1;
        }
                
    }
}