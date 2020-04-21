class Solution {
    public int[] sortArrayByParity(int[] A) {
        int len = A.length;
        int arr[] = new int[len];
        
        int j = 0;
        int k = len-1;
        for(int i=0;i<len;i++) {
            if(A[i] % 2 == 0) {
                arr[j] = A[i];
                j += 1;
            }else {
                arr[k] = A[i];
                k -= 1;
            }
        }
        
        
        return arr;
    }
}