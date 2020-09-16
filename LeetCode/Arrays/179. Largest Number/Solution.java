/*

    Time Complexity: o(n logn)
    Space Complexity: o(n)

*/

class Solution {
    public String largestNumber(int[] nums) {
        
        StringBuilder sb = new StringBuilder();
        
        if(nums.length == 0) {
            return "";
        }
        
        String[] s = new String[nums.length];
        
        for(int i=0;i<s.length;i++) {
            s[i] = Integer.toString(nums[i]);
        }
        
        Arrays.sort(s, new Comparator<String>() {
            public int compare(String a, String b) {
                String o1 = a + b;
                String o2 = b + a;
                
                return o2.compareTo(o1);
            }
        } );
        
        // in case whole array is 0
        
        if(s[0].equals("0")) {
            return "0";
        }
        
        for(String x : s) {
            sb.append(x);
        }
        
        return sb.toString();
    }
}