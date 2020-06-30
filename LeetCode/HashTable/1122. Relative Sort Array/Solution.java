class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        // PUT ARR2 in the MAP
        for(int i : arr2) {
            map.put(i, 0);
        }
        
        int high = arr1.length - 1;
        
        int[] arr = new int[arr1.length];
        
        // increment the no of times the element occurs 
        for(int i : arr1) {
            if(map.containsKey(i)) {
                map.put(i,map.get(i)+1);
            } else {
                arr[high--] = i;
            }
        }
        
        int index = 0;
        
        for(int i : arr2) {
            int val = map.get(i);
            for(int j=0;j<val;j++) {
                arr[index++] = i;
            }
        }
        /* left overs */ 
        Arrays.sort(arr, index, arr1.length);
        return arr;
        
    }
}