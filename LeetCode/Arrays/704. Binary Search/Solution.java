class Solution {
    public int search(int[] nums, int target) {
        return binarySearch(nums, 0, nums.length-1, target);
    }
    
    public int binarySearch(int[] a, int low, int high, int target) {
        while(low <= high) {
            int mid = low + (high - low) / 2;
            
            if(a[mid] == target) {
                return mid;
            }
            
            else if(a[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
            
        }
        
        return -1;
    }
    
}