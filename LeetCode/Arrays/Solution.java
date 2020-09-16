// Time Complexity O(N) 

/*
    init i and j to the top right element.
    Search for the element from there
    if matrix[i][j] == target return true;
    if the target is less than current index value decrement the column
    if greater than the curr index, then increment i.
*/

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        if(matrix.length == 0 || matrix[0].length == 0  ) {
            return false;
        } 
        
        int row = matrix.length;
        int col = matrix[0].length;
        int i = 0;
        int j = col - 1;
        
        
        
        while(i<row && j >= 0) {
            if(matrix[i][j] == target) {
                return true;
            } if(matrix[i][j] > target) {
                j--;
            } else {
                i++;
            }
        }
        
        return false;
    }
}