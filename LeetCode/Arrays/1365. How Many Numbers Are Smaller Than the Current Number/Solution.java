/*

Given the array nums, for each nums[i] find out how many numbers
in the array are smaller than it.

*/

class Solution {
    
    public int getCount(int[] arr,int val) {
        int count = 0;
        
        for(int i=0;i<arr.length;i++) {
            if(arr[i] < val) {
                count += 1;
            }
            
            
        }
        return count;
    }
    
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int newArr[] = new int[nums.length];
        
        for(int i=0;i<nums.length;i++) {
            newArr[i] = getCount(nums,nums[i]);
        }
        
        return newArr;
        
    }
}