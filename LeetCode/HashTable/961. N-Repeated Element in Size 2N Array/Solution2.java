class Solution {
    public int repeatedNTimes(int[] A) {
        int n = A.length/2;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<A.length;i++) {
            if(map.containsKey(A[i])) {
                map.put(A[i],map.get(A[i])+1);
            } else {
                map.put(A[i],1);
            }
        }
        
        for(Map.Entry<Integer,Integer> data : map.entrySet()) {
            if(data.getValue() == n) {
                return data.getKey();
            }
        }
        return 0;
        
    }
}