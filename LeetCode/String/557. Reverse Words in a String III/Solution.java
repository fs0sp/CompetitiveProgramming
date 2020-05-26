class Solution {
    
    public String reverse(String s) {
        if(s.isEmpty()) {
            return s;
        }
        
        return reverse(s.substring(1)) + s.charAt(0);
    }
    
    public String reverseWords(String s) {
        
        String[] temp = s.split("\\s+");
        
        
        for(int i=0;i<temp.length;i++) {
            temp[i] = reverse(temp[i]);
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<temp.length;i++) {
            
            
            sb.append(temp[i]);
            sb.append(" ");
        }
        
        return sb.toString().trim();
        
        
    }
}