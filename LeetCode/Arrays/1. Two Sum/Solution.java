/*

	Given an array of integers, return indices of the two numbers
	such that they add up to a specific target.

	You may assume that each input would have exactly one solution,
	and you may not use the same element twice
	
	Given nums = [2, 7, 11, 15], target = 9,

*/


class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> num = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            int check = target - nums[i];
            if(num.containsKey(check)) {
                return new int[] {num.get(check), i};
            }
            num.put(nums[i],i);
        }
        return new int[] {0,0};
    }
}