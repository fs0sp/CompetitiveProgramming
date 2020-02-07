/*

    Given an array of integers arr, write a function that returns true
    if and only if the number of
    occurrences of each value in the array is unique.
    
    Input: arr = [1,2,2,1,1,3]
    Output: true
    Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1.
    No two values have the same number of occurrences.

*/

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap();
        for(int i=0;i<arr.length;i++) {
            if(map.containsKey(arr[i])) {
                map.put(arr[i],map.get(arr[i])+1);
            } else {
                map.put(arr[i],1);
            }
        }
        HashSet<Integer> set = new HashSet(map.values());
        return map.size() == set.size();
    }
}