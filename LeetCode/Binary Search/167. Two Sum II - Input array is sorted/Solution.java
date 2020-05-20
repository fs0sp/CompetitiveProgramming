class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        
        int low = 0;
        int high = numbers.length-1;
        int sum = numbers[low] + numbers[high];
        
        while(sum != target) {
            
            if(sum > target) {
                high -= 1;
            } else if( sum < target) {
                low += 1;
            }
            
            sum = numbers[low] + numbers[high];
        }
        
        return new int[] {low+1, high+1};
        
    }
}