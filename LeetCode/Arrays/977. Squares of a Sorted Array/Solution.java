class Solution {
    public int[] sortedSquares(int[] A) {
    
        // SPACE : O(N)
        // TIME : O(n logn)
        
        int[] arr = new int[A.length];
        
        for(int i=0;i<A.length;i++) {
            arr[i] = A[i] * A[i];
        }
        
        Arrays.sort(arr);
        
        for(int i=0;i<arr.length;i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }
        
        return arr;
        
        
    }
}