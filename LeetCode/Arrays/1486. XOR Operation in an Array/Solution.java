class Solution {
    public int xorOperation(int n, int start) {
        int currXor = 0;
        int[] a = new int[n];
        
        for(int i=0;i<n;i++) {
            a[i] = start + 2 * i;
        }
        
        currXor = a[0];
        
        for(int i=1;i<n;i++) {
            currXor = currXor ^ a[i];
        }
        
        return currXor;
        
    }
}