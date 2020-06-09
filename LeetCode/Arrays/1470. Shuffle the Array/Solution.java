class Solution {
    public int[] shuffle(int[] nums, int n) {
        int ans[] = new int[nums.length];
        int j = 0;
        
        for(int i=0;i<ans.length;i++) {
            if(j < ans.length) {
                ans[j++] = nums[i];
                ans[j] = nums[n];
                j++;
                n++;
            }
        }
        
        return ans;
        
    }
}