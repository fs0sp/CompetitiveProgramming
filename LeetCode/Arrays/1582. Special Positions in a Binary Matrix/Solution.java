/*
    
    Time Complexity : o(n^2) 
    Space Complexity : o(n)

*/

class Solution {
    public int numSpecial(int[][] mat) {
        
        int m = mat.length;
        int n = mat[0].length;
        int res = 0;
        
        // array for storing the row sum
        
        int[] rowSum = new int[m];
        
        // array for storing the col sum 
        
        int[] colSum = new int[n];
        
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                rowSum[i] += mat[i][j];
                colSum[j] += mat[i][j];
            }
        }
        
        // computing the answer
        
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                if(mat[i][j] == 1 && rowSum[i] == 1 && colSum[j] == 1) {
                    res += 1;
                }
            }
        }
        
        return res;
        
        
    }
}