class Solution {
    public int longestConsecutive(int[] nums) {
        
        HashSet<Integer> set = new HashSet<>();
        
        for(int i : nums) {
            set.add(i);
        }
        
        int longestStreak = 0;
        
        for(int i : set) {
            if(!set.contains(i-1)) {
                int num = i;
                int currentStreak = 1;
                
                while(set.contains(num + 1)) {
                    currentStreak += 1;
                    num += 1;
                }
                
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }
        
        return longestStreak;
        
    }
}