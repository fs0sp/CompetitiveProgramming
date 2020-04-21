class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();
        
        
        for(int i : nums1) {
            set1.add(i);
        }
        
        for(int i : nums2) {
            if(set1.contains(i)) {
                result.add(i);
            }
        }
        
        int j = 0;
        int[] arr = new int[result.size()]; 
        for(int i : result) {
            arr[j] = i;
            j++;
        }
        
        return arr;
    }
}