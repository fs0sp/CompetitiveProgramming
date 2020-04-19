class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set = new LinkedHashSet<>();
        for(int i=0;i<nums.length;i++) {
            set.add(nums[i]);
        }
        
        int size = 0;
        for(int n : set) {
            nums[size++] = n;
        }
        
        return size;
    }
}