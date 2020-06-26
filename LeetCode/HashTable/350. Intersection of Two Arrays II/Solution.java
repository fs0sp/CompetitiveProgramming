class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] ans = new int[nums2.length];
        
        int j = 0;
        
        for(int i=0;i<nums1.length;i++) {
            int val = map.getOrDefault(nums1[i], 0);
            map.put(nums1[i], val + 1);
        }
        
        for(int i=0;i<nums2.length;i++) {
            if(map.containsKey(nums2[i])) {
                int val = map.get(nums2[i]); 
                if(val > 0) {
                    map.put(nums2[i], val - 1);
                    ans[j++] = nums2[i];
                }
            }
        }
        
        int[] arr=new int[j];
        for(int i=0;i<j;i++) {
            arr[i]=ans[i];  
        }
             
        
        
        return arr;
        
    }
}