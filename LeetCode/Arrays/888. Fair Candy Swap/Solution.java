class Solution {
    public int[] fairCandySwap(int[] A, int[] B) {
        
        int sumAlice = 0;
        int sumBob = 0;
        
        for(int i : A) {
            sumAlice += i;
        }
        for(int i : B) {
            sumBob += i;
        }
        int d = (sumBob - sumAlice ) / 2;
        HashSet<Integer> set = new HashSet<>();
        
        for(int i : B) {
            set.add(i);
        }
        
        for(int i : A) {
            if(set.contains(i + d)) {
                return new int[] {i, i + d};
            }
        }
        
        return new int[] {0,0};        
    }
}