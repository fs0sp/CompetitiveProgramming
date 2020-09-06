class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        // int m = mat.length;
        int mid = n / 2;
        
        if(mat.length == 1) {
            return mat[0][0];
        }
        
        int sum = 0;
        
        int primarySum = 0;
        int secSum = 0;
        
        for(int i=0;i<n;i++) {
            primarySum += mat[i][i];
            secSum += mat[i][n-i-1];
            
        }
        
        sum = primarySum + secSum;
        
        if(n % 2 == 0) {
            return sum;
        }
        
        return sum - mat[mid][mid];
        
    }
}