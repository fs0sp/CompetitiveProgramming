class Solution {
    public int repeatedNTimes(int[] A) {
        List<Integer> list = new ArrayList<>();
        
        for(int a : A) {
            if(list.contains(a)) {
                return a;
            } else {
                list.add(a);
            }
        }
        
        return 0;
        
    }
}